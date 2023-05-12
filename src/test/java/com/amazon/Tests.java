package com.amazon;

import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.api.SellersApi;

public class Tests {
	
	static {
		// Log4j from 2.17.>
		//System.setProperty("log4j2.Configuration.allowedProtocols", "http");

		// URL file di configurazione Log4j2
		System.setProperty("log4j.configurationFile", "https://gist.github.com/vidaniello/c20e29cdffb407ec5d3c773fb92786b9/raw/92c8e809f51133ef56e4867a6cabb0744ee6b9b6/log4j2.xml");

		// Tips per java.util.logging
		System.setProperty("java.util.logging.manager", "org.apache.logging.log4j.jul.LogManager");

		// private org.apache.logging.log4j.Logger log =
		// org.apache.logging.log4j.LogManager.getLogger();
	}
	
	private Logger log = LogManager.getLogger();
	
	@Test
	public void test1() {
		
		String propertyFile = "D:/amazonsp/amazonsp_credentials.properties";
		
		try (InputStream input = new FileInputStream(propertyFile)) {
			
			
			
			Properties propertyes = new Properties();
			propertyes.load(input);
			
			String awsAuthenticationCredentials_accessKeyId = "awsAuthenticationCredentials.accessKeyId";
			String awsAuthenticationCredentials_secretKey = "awsAuthenticationCredentials.secretKey";
			String awsAuthenticationCredentials_region = "eu-west-1";
			
			String awsAuthenticationCredentials_roleArn = "awsAuthenticationCredentials.roleArn";
			String awsAuthenticationCredentials_roleSessionName = "awsAuthenticationCredentials.roleSessionName";
			
			AWSAuthenticationCredentials awsAuthenticationCredentials = new AWSAuthenticationCredentials()
	                  .setAccessKeyId(propertyes.getProperty(awsAuthenticationCredentials_accessKeyId))
	                  .setSecretKey(propertyes.getProperty(awsAuthenticationCredentials_secretKey))
	                  .setRegion(awsAuthenticationCredentials_region);
			
			AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider = new AWSAuthenticationCredentialsProvider()
	                  .setRoleArn(propertyes.getProperty(awsAuthenticationCredentials_roleArn))
	                  .setRoleSessionName(propertyes.getProperty(awsAuthenticationCredentials_roleSessionName));
			
			/*
	        LWAAuthorizationCredentials lwaAuthorizationCredentials = LWAAuthorizationCredentials.builder()
	                  .clientId("amzn1.application-*********************")
	                  .clientSecret("***********************************")
	                  .refreshToken("Atzr|******************************")
	                  .endpoint("https://api.amazon.com/auth/o2/token")
	                  .build();
	        */
			
			SellersApi sellersApi = new SellersApi.Builder()
	                  .awsAuthenticationCredentials(awsAuthenticationCredentials)
	                  .awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
	                  .lwaAuthorizationCredentials(null)
	                  .endpoint("https://sellingpartnerapi-na.amazon.com") // use Sandbox URL here if you would like to test your applications without affecting production data.
	                  .build();
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AssertionError(e);
		}
	}

}
