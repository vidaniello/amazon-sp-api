package com.github.vidaniello.amazon;

import java.io.Closeable;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.zip.GZIPInputStream;

import org.apache.commons.io.IOUtils;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.okhttp.Request;
import com.squareup.okhttp.RequestBody;
import com.squareup.okhttp.Response;
import com.squareup.okhttp.ResponseBody;

/**
 * Varius utility for the Amazon SP-API
 * @author Vincenzo D'Aniello (vidaniello@gmail.com) github.com/vidaniello
 *
 */
public class UtilSPAPI {
	
	/**
	 * Example finded <a href="https://developer-docs.amazon.com/sp-api/docs/feeds-api-v2021-06-30-use-case-guide">here</a>
	 * @param source
	 * @param url
	 * @param contentType
	 * @throws Exception
	 */
	public static void upload(byte[] source, String url, String contentType) throws Exception {
		OkHttpClient client = new OkHttpClient();

		// The contentType must match the input provided to the createFeedDocument
		// operation. This example uses text/xml, but your contentType may be different
		// depending upon on your chosen feedType (text/plain, text/csv, and so on).

		Request request = new Request.Builder().url(url).put(RequestBody.create(MediaType.parse(contentType), source))
				.build();

		Response response = client.newCall(request).execute();
		if (!response.isSuccessful()) {
			throw new Exception(String.format("Call to upload document failed with response code: %d and message: %s",
					response.code(), response.message()));
		}

	}
	
	public static void downloadForFeed(
			String url, 
			com.amazon.model.feeds.FeedDocument.CompressionAlgorithmEnum compressionAlgorithm, 
			OutputStream outStream
	) throws Exception {
		
		if(compressionAlgorithm!=null)
			download(url, compressionAlgorithm.getValue(), outStream);
		else
			download(url, null, outStream);
	}
	
	public static void downloadForReport(
			String url, 
			com.amazon.model.reports.ReportDocument.CompressionAlgorithmEnum compressionAlgorithm, 
			OutputStream outStream
	) throws Exception {
		
		if(compressionAlgorithm!=null)
			download(url, compressionAlgorithm.getValue(), outStream);
		else
			download(url, null, outStream);
	}
	
	
	/**
	 * Download and optionally decompress the document retrieved from the given url.<br>
	 * Example finded <a href="https://developer-docs.amazon.com/sp-api/docs/feeds-api-v2021-06-30-use-case-guide">here</a>
	 * @param url                  the url pointing to a document
	 * @param compressionAlgorithm the compressionAlgorithm used for the document
	 * @throws Exception 
	 */
	public static void download(String url, String compressionAlgorithm, OutputStream outStream) throws Exception {
		OkHttpClient httpclient = new OkHttpClient();
		Request request = new Request.Builder().url(url).get().build();

		Response response = httpclient.newCall(request).execute();
		if (!response.isSuccessful()) {
			throw new Exception(
					String.format("Call to download content was unsuccessful with response code: %d and message: %s",
							response.code(), response.message()));
			
		}

		try (ResponseBody responseBody = response.body()) {
			MediaType mediaType = MediaType.parse(response.header("Content-Type"));
			Charset charset = mediaType.charset();
			if (charset == null) {
				throw new IllegalArgumentException(
						String.format("Could not parse character set from '%s'", mediaType.toString()));
			}

			Closeable closeThis = null;
			try {
				@SuppressWarnings("resource")
				InputStream inputStream = responseBody.byteStream();
				closeThis = inputStream;

				if(compressionAlgorithm!=null)
					if ("GZIP".equals(compressionAlgorithm)) {
						inputStream = new GZIPInputStream(inputStream);
						closeThis = inputStream;
					}

				// This example assumes that the download content has a charset in the
				// content-type header, e.g.
				// text/plain; charset=UTF-8
				//if ("text".equals(mediaType.type()) && "plain".equals(mediaType.subtype())) {
					//InputStreamReader inputStreamReader = new InputStreamReader(inputStream, charset);
					//closeThis = inputStreamReader;

					//BufferedReader reader = new BufferedReader(inputStreamReader);
					//closeThis = reader;

					//String line;
					//do {
						//line = reader.readLine();
						// Process line by line.
					//} while (line != null);
				//} else 
					IOUtils.copy(inputStream, outStream);
				
			} finally {
				if (closeThis != null) {
					closeThis.close();
				}
			}
		}
	}

}
