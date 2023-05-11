/*
 * Selling Partner API for Listings Restrictions
 * The Selling Partner API for Listings Restrictions provides programmatic access to restrictions on Amazon catalog listings.  For more information, see the [Listings Restrictions API Use Case Guide](doc:listings-restrictions-api-v2021-08-01-use-case-guide).
 *
 * OpenAPI spec version: 2021-08-01
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.amazon.api;

import com.amazon.invoker.ApiCallback;
import com.amazon.invoker.ApiClient;
import com.amazon.invoker.ApiException;
import com.amazon.invoker.ApiResponse;
import com.amazon.invoker.Configuration;
import com.amazon.invoker.Pair;
import com.amazon.invoker.ProgressRequestBody;
import com.amazon.invoker.ProgressResponseBody;
import com.amazon.invoker.StringUtil;

import com.google.gson.reflect.TypeToken;

import java.io.IOException;


import com.amazon.model.listingsrestrictions.ErrorList;
import com.amazon.model.listingsrestrictions.RestrictionList;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentials;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.AWSAuthenticationCustomCredentialsProvider;
import com.amazon.SellingPartnerAPIAA.AWSSigV4Signer;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCache;
import com.amazon.SellingPartnerAPIAA.LWAAccessTokenCacheImpl;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationCredentials;
import com.amazon.SellingPartnerAPIAA.LWAAuthorizationSigner;
import com.amazon.SellingPartnerAPIAA.RateLimitConfiguration;

public class ListingsApi {
    private ApiClient apiClient;

    ListingsApi() {
        this(Configuration.getDefaultApiClient());
    }

    public ListingsApi(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public void setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Build call for getListingsRestrictions
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param sellerId A selling partner identifier, such as a merchant account. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param conditionType The condition used to filter restrictions. (optional)
     * @param reasonLocale A locale for reason text localization. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param progressListener Progress listener
     * @param progressRequestListener Progress request listener
     * @return Call to execute
     * @throws ApiException If fail to serialize the request body object
     */
    public com.squareup.okhttp.Call getListingsRestrictionsCall(String asin, String sellerId, List<String> marketplaceIds, String conditionType, String reasonLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        Object localVarPostBody = null;

        // create path and map variables
        String localVarPath = "/listings/2021-08-01/restrictions";

        List<Pair> localVarQueryParams = new ArrayList<Pair>();
        List<Pair> localVarCollectionQueryParams = new ArrayList<Pair>();
        if (asin != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("asin", asin));
        if (conditionType != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("conditionType", conditionType));
        if (sellerId != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("sellerId", sellerId));
        if (marketplaceIds != null)
        localVarCollectionQueryParams.addAll(apiClient.parameterToPairs("csv", "marketplaceIds", marketplaceIds));
        if (reasonLocale != null)
        localVarQueryParams.addAll(apiClient.parameterToPair("reasonLocale", reasonLocale));

        Map<String, String> localVarHeaderParams = new HashMap<String, String>();

        Map<String, Object> localVarFormParams = new HashMap<String, Object>();

        final String[] localVarAccepts = {
            "application/json"
        };
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        final String[] localVarContentTypes = {
            "application/json"
        };
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);

        if(progressListener != null) {
            apiClient.getHttpClient().networkInterceptors().add(new com.squareup.okhttp.Interceptor() {
                @Override
                public com.squareup.okhttp.Response intercept(com.squareup.okhttp.Interceptor.Chain chain) throws IOException {
                    com.squareup.okhttp.Response originalResponse = chain.proceed(chain.request());
                    return originalResponse.newBuilder()
                    .body(new ProgressResponseBody(originalResponse.body(), progressListener))
                    .build();
                }
            });
        }

        String[] localVarAuthNames = new String[] {  };
        return apiClient.buildCall(localVarPath, "GET", localVarQueryParams, localVarCollectionQueryParams, localVarPostBody, localVarHeaderParams, localVarFormParams, localVarAuthNames, progressRequestListener);
    }

    @SuppressWarnings("rawtypes")
    private com.squareup.okhttp.Call getListingsRestrictionsValidateBeforeCall(String asin, String sellerId, List<String> marketplaceIds, String conditionType, String reasonLocale, final ProgressResponseBody.ProgressListener progressListener, final ProgressRequestBody.ProgressRequestListener progressRequestListener) throws ApiException {
        
        // verify the required parameter 'asin' is set
        if (asin == null) {
            throw new ApiException("Missing the required parameter 'asin' when calling getListingsRestrictions(Async)");
        }
        
        // verify the required parameter 'sellerId' is set
        if (sellerId == null) {
            throw new ApiException("Missing the required parameter 'sellerId' when calling getListingsRestrictions(Async)");
        }
        
        // verify the required parameter 'marketplaceIds' is set
        if (marketplaceIds == null) {
            throw new ApiException("Missing the required parameter 'marketplaceIds' when calling getListingsRestrictions(Async)");
        }
        

        com.squareup.okhttp.Call call = getListingsRestrictionsCall(asin, sellerId, marketplaceIds, conditionType, reasonLocale, progressListener, progressRequestListener);
        return call;

    }

    /**
     * 
     * Returns listing restrictions for an item in the Amazon Catalog.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param sellerId A selling partner identifier, such as a merchant account. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param conditionType The condition used to filter restrictions. (optional)
     * @param reasonLocale A locale for reason text localization. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return RestrictionList
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public RestrictionList getListingsRestrictions(String asin, String sellerId, List<String> marketplaceIds, String conditionType, String reasonLocale) throws ApiException {
        ApiResponse<RestrictionList> resp = getListingsRestrictionsWithHttpInfo(asin, sellerId, marketplaceIds, conditionType, reasonLocale);
        return resp.getData();
    }

    /**
     * 
     * Returns listing restrictions for an item in the Amazon Catalog.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param sellerId A selling partner identifier, such as a merchant account. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param conditionType The condition used to filter restrictions. (optional)
     * @param reasonLocale A locale for reason text localization. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @return ApiResponse&lt;RestrictionList&gt;
     * @throws ApiException If fail to call the API, e.g. server error or cannot deserialize the response body
     */
    public ApiResponse<RestrictionList> getListingsRestrictionsWithHttpInfo(String asin, String sellerId, List<String> marketplaceIds, String conditionType, String reasonLocale) throws ApiException {
        com.squareup.okhttp.Call call = getListingsRestrictionsValidateBeforeCall(asin, sellerId, marketplaceIds, conditionType, reasonLocale, null, null);
        Type localVarReturnType = new TypeToken<RestrictionList>(){}.getType();
        return apiClient.execute(call, localVarReturnType);
    }

    /**
     *  (asynchronously)
     * Returns listing restrictions for an item in the Amazon Catalog.   **Usage Plan:**  | Rate (requests per second) | Burst | | ---- | ---- | | 5 | 10 |  The &#x60;x-amzn-RateLimit-Limit&#x60; response header returns the usage plan rate limits that were applied to the requested operation, when available. The table above indicates the default rate and burst values for this operation. Selling partners whose business demands require higher throughput may see higher rate and burst values then those shown here. For more information, see [Usage Plans and Rate Limits in the Selling Partner API](doc:usage-plans-and-rate-limits-in-the-sp-api).
     * @param asin The Amazon Standard Identification Number (ASIN) of the item. (required)
     * @param sellerId A selling partner identifier, such as a merchant account. (required)
     * @param marketplaceIds A comma-delimited list of Amazon marketplace identifiers for the request. (required)
     * @param conditionType The condition used to filter restrictions. (optional)
     * @param reasonLocale A locale for reason text localization. When not provided, the default language code of the first marketplace is used. Examples: \&quot;en_US\&quot;, \&quot;fr_CA\&quot;, \&quot;fr_FR\&quot;. Localized messages default to \&quot;en_US\&quot; when a localization is not available in the specified locale. (optional)
     * @param callback The callback to be executed when the API call finishes
     * @return The request call
     * @throws ApiException If fail to process the API call, e.g. serializing the request body object
     */
    public com.squareup.okhttp.Call getListingsRestrictionsAsync(String asin, String sellerId, List<String> marketplaceIds, String conditionType, String reasonLocale, final ApiCallback<RestrictionList> callback) throws ApiException {

        ProgressResponseBody.ProgressListener progressListener = null;
        ProgressRequestBody.ProgressRequestListener progressRequestListener = null;

        if (callback != null) {
            progressListener = new ProgressResponseBody.ProgressListener() {
                @Override
                public void update(long bytesRead, long contentLength, boolean done) {
                    callback.onDownloadProgress(bytesRead, contentLength, done);
                }
            };

            progressRequestListener = new ProgressRequestBody.ProgressRequestListener() {
                @Override
                public void onRequestProgress(long bytesWritten, long contentLength, boolean done) {
                    callback.onUploadProgress(bytesWritten, contentLength, done);
                }
            };
        }

        com.squareup.okhttp.Call call = getListingsRestrictionsValidateBeforeCall(asin, sellerId, marketplaceIds, conditionType, reasonLocale, progressListener, progressRequestListener);
        Type localVarReturnType = new TypeToken<RestrictionList>(){}.getType();
        apiClient.executeAsync(call, localVarReturnType, callback);
        return call;
    }

    public static class Builder {
        private AWSAuthenticationCredentials awsAuthenticationCredentials;
        private LWAAuthorizationCredentials lwaAuthorizationCredentials;
        private String endpoint;
        private LWAAccessTokenCache lwaAccessTokenCache;
        private Boolean disableAccessTokenCache = false;
        private AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider;
        private RateLimitConfiguration rateLimitConfiguration;
        private AWSAuthenticationCustomCredentialsProvider awsAuthenticationCustomCredentialsProvider;

        public Builder awsAuthenticationCredentials(AWSAuthenticationCredentials awsAuthenticationCredentials) {
            this.awsAuthenticationCredentials = awsAuthenticationCredentials;
            return this;
        }

        public Builder lwaAuthorizationCredentials(LWAAuthorizationCredentials lwaAuthorizationCredentials) {
            this.lwaAuthorizationCredentials = lwaAuthorizationCredentials;
            return this;
        }

        public Builder endpoint(String endpoint) {
            this.endpoint = endpoint;
            return this;
        }
        
        public Builder lwaAccessTokenCache(LWAAccessTokenCache lwaAccessTokenCache) {
            this.lwaAccessTokenCache = lwaAccessTokenCache;
            return this;
        }
		
	   public Builder disableAccessTokenCache() {
            this.disableAccessTokenCache = true;
            return this;
        }
        
        public Builder awsAuthenticationCredentialsProvider(AWSAuthenticationCredentialsProvider awsAuthenticationCredentialsProvider) {
            this.awsAuthenticationCredentialsProvider = awsAuthenticationCredentialsProvider;
            return this;
        }
        
        public Builder rateLimitConfigurationOnRequests(RateLimitConfiguration rateLimitConfiguration){
            this.rateLimitConfiguration = rateLimitConfiguration;
            return this;
        }
        
        public Builder disableRateLimitOnRequests() {
            this.rateLimitConfiguration = null;
            return this;
        }

        public Builder awsAuthenticationCustomCredentialsProvider(AWSAuthenticationCustomCredentialsProvider awsAuthenticationCustomCredentialsProvider) {
            this.awsAuthenticationCustomCredentialsProvider = awsAuthenticationCustomCredentialsProvider;
            return this;
        }
        

        public ListingsApi build() {
            if (awsAuthenticationCredentials == null && awsAuthenticationCustomCredentialsProvider == null) {
                throw new RuntimeException("Neither AWSAuthenticationCredentials or AWSAuthenticationCustomCredentialsProvider are set");
            }

            if (lwaAuthorizationCredentials == null) {
                throw new RuntimeException("LWAAuthorizationCredentials not set");
            }

            if (StringUtil.isEmpty(endpoint)) {
                throw new RuntimeException("Endpoint not set");
            }

            AWSSigV4Signer awsSigV4Signer;
            if (awsAuthenticationCustomCredentialsProvider != null ) {
                awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCustomCredentialsProvider);
            }
            else if (awsAuthenticationCredentialsProvider == null) {
                awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials);
            }
            else {
                awsSigV4Signer = new AWSSigV4Signer(awsAuthenticationCredentials,awsAuthenticationCredentialsProvider);
            }
            
            LWAAuthorizationSigner lwaAuthorizationSigner = null;            
            if (disableAccessTokenCache) {
                lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials);
            }
            else {
                if (lwaAccessTokenCache == null) {
                    lwaAccessTokenCache = new LWAAccessTokenCacheImpl();                  
                 }
                 lwaAuthorizationSigner = new LWAAuthorizationSigner(lwaAuthorizationCredentials,lwaAccessTokenCache);
            }

            return new ListingsApi(new ApiClient()
                .setAWSSigV4Signer(awsSigV4Signer)
                .setLWAAuthorizationSigner(lwaAuthorizationSigner)
                .setBasePath(endpoint)
                .setRateLimiter(rateLimitConfiguration));
        }
    }
}
