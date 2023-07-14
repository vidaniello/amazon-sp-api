package com.amazon;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.api.OrdersV0Api;
import com.amazon.api.SellersApi;
import com.amazon.invoker.ApiResponse;
import com.amazon.model.orders.GetOrderAddressResponse;
import com.amazon.model.orders.GetOrderBuyerInfoResponse;
import com.amazon.model.orders.GetOrderItemsResponse;
import com.amazon.model.orders.GetOrderResponse;
import com.amazon.model.sellers.GetMarketplaceParticipationsResponse;

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
		
		String propertyFileName = 	"amazonsp_credentials.properties";
		String pathPropertyFile = 	System.getProperty("user.home");
		String propertyFile = 		pathPropertyFile+File.separator+propertyFileName;
		
		try (InputStream input = new FileInputStream(propertyFile)) {		
			
			Properties propertyes = new Properties();
			propertyes.load(input);
			
			String awsAuthenticationCredentials_accessKeyId = 		"awsAuthenticationCredentials.accessKeyId";
			String awsAuthenticationCredentials_secretKey = 		"awsAuthenticationCredentials.secretKey";
			//String awsAuthenticationCredentials_region = 			"us-east-1";
			String awsAuthenticationCredentials_region = 			"eu-west-1";
			
			String awsAuthenticationCredentials_roleArn = 			"awsAuthenticationCredentials.roleArn";
			String awsAuthenticationCredentials_roleSessionName = 	"awsAuthenticationCredentials.roleSessionName";
			
			String lwaAuthorizationCredentials_clientId = 			"lwaAuthorizationCredentials.clientId";
			String lwaAuthorizationCredentials_clientSecret = 		"lwaAuthorizationCredentials.clientSecret";
			String lwaAuthorizationCredentials_refreshToken = 		"lwaAuthorizationCredentials.refreshToken";
			String lwaAuthorizationCredentials_endpoint = 			"https://api.amazon.com/auth/o2/token";
			
			/**
			 * Use Sandbox URL here if you would like to test your applications without affecting production data.
			 */
			//String sellersApi_endpoint = 							"https://sellingpartnerapi-na.amazon.com";
			String sellersApi_endpoint = 							"https://sellingpartnerapi-eu.amazon.com";
			
			AWSAuthenticationCredentials awsAuthenticationCredentials = new AWSAuthenticationCredentials()
	                  .setAccessKeyId	(propertyes.getProperty(awsAuthenticationCredentials_accessKeyId))
	                  .setSecretKey		(propertyes.getProperty(awsAuthenticationCredentials_secretKey))
	                  .setRegion		(awsAuthenticationCredentials_region);
			
			AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider = new AWSAuthenticationCredentialsProvider()
	                  .setRoleArn			(propertyes.getProperty(awsAuthenticationCredentials_roleArn))
	                  .setRoleSessionName	(propertyes.getProperty(awsAuthenticationCredentials_roleSessionName));
			
			
	        LWAAuthorizationCredentials lwaAuthorizationCredentials = new LWAAuthorizationCredentials()
	                  .setClientId			(propertyes.getProperty(lwaAuthorizationCredentials_clientId))
	                  .setClientSecret		(propertyes.getProperty(lwaAuthorizationCredentials_clientSecret))
	                  .setRefreshToken		(propertyes.getProperty(lwaAuthorizationCredentials_refreshToken))
	                  .setEndpoint			(lwaAuthorizationCredentials_endpoint);
	        
			
			SellersApi sellersApi = new SellersApi.Builder()
	                  .awsAuthenticationCredentials			(awsAuthenticationCredentials)
	                  .awsAuthenticationCredentialsProvider	(awsAuthenticationCredentialsProvider)
	                  .lwaAuthorizationCredentials			(lwaAuthorizationCredentials)
	                  .endpoint								(sellersApi_endpoint)
	                  .build();
			
			//ApiResponse<GetMarketplaceParticipationsResponse> mppr = sellersApi.getMarketplaceParticipationsWithHttpInfo();
			
	        
	        
	        OrdersV0Api orders = new OrdersV0Api.Builder()
	        		.awsAuthenticationCredentials(awsAuthenticationCredentials)
	        		.awsAuthenticationCredentialsProvider(awsAuthenticationCredentialsProvider)
	        		.lwaAuthorizationCredentials(lwaAuthorizationCredentials)
	        		.endpoint(sellersApi_endpoint)
	        		.build();
	        
	        String orderId = System.getProperty("amazonOrderId");
	        
	        GetOrderResponse order = orders.getOrder(orderId);
	        GetOrderBuyerInfoResponse orderBuyerInfo =  orders.getOrderBuyerInfo(orderId);
	        GetOrderAddressResponse orderAddress = orders.getOrderAddress(orderId);
	        GetOrderItemsResponse orderItems = orders.getOrderItems(orderId, null);
	        
			
			int i = 0;
			
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
			throw new AssertionError(e);
		}
	}

}
