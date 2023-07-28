# amazon-sp-api

Amazon selling partner API java client.

### Introduction

This project was generated by swagger, see my repository [vidaniello/amazon-sp-api-swagger-generator](https://github.com/vidaniello/amazon-sp-api-swagger-generator) for more information.

In addition, as some java classes provided by the project [amzn/selling-partner-api-models](https://github.com/amzn/selling-partner-api-models) and others generated by the same swagger have problems and bugs, this library has been fixed and tested, and allows restful calls to be made via the amazon sp api.

### Configuration

The configuration for the use, authorization etc. for the use of the amazon API is not simple to set up, for this refer to the documentation provided by amazon at [this link](https://developer-docs.amazon.com/sp-api/docs/connecting-to-the-selling-partner-api-using-a-generated-java-sdk).

For the test environment, a file named `amazonsp_credentials.properties` must be set up in the user folder, that is, the one corresponding to the java call `System.getProperty("user.home")`. 

An example of such a file is present in the folder [test/resources](https://github.com/vidaniello/amazon-sp-api/tree/main/src/test/resources/amazonsp_credentials.properties). Copy and paste it into the user folder, then obviously set out all the variables needed to authenticate for the use of the API.

Attention! Make sure that dependency resolution causes the com.google.code.gson:gson library to be calculated at at least varsion 2.8.9.
```
        <!-- https://mvnrepository.com/artifact/com.google.code.gson/gson -->
        <dependency>
            <groupId>com.google.code.gson</groupId>
            <artifactId>gson</artifactId>
            <version>2.8.9</version>
        </dependency>
```

Also these apache dependencies are needed at least this version:

```
			<dependency>
				<groupId>org.apache.httpcomponents</groupId>
				<artifactId>httpclient</artifactId>
				<version>4.5.13</version>
			</dependency>
			<dependency>
				<groupId>org.apache.httpcomponents</groupId>
				<artifactId>httpcore</artifactId>
				<version>4.4.13</version>
			</dependency>
			<dependency>
			    <groupId>joda-time</groupId>
			    <artifactId>joda-time</artifactId>
			    <version>2.8.1</version>
			</dependency>			
```

### Use

#### Test environment

[Here](https://developer-docs.amazon.com/sp-api-blog/docs/automate-your-sp-api-calls-using-java-sdk#step-5-connect-to-the-selling-partner-api-using-the-generated-java-sdk) it is possible to read an example of using the amazon sp API, but since there were bugs and errors, this library presents the example in a slightly different way, that is, by viewing the class [Tests.java](https://github.com/vidaniello/amazon-sp-api/blob/main/src/test/java/com/amazon/Tests.java) you will see an example for calling `getMarketplaceParticipation` and a series of examples for calling objects related to a 'order amazon.

To see an example of reading amazon order, start the test with VM variable `-DamazonOrderId=XXX-XXXXXXX-XXXXXXX` like this.

#### Production environment

In production, my advice is to do as you think best, being careful to keep the access credentials well and securely.