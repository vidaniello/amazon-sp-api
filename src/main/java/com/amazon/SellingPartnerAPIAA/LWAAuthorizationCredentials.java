package com.amazon.SellingPartnerAPIAA;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

import java.util.Arrays;
import java.util.HashSet;

/**
 * LWAAuthorizationCredentials
 */
@Data
@Builder
public class LWAAuthorizationCredentials {
    /**
     * LWA Client Id
     */
    @NonNull
    private String clientId;

    /**
     * LWA Client Secret
     */
    @NonNull
    private String clientSecret;

    /**
     * LWA Refresh Token
     */
    private String refreshToken;

    /**
     * LWA Authorization Server Endpoint
     */
    @NonNull
    private String endpoint;

    /**
     * LWA Client Scopes
     */
    private LWAClientScopes scopes;

    public class LWAAuthorizationCredentialsBuilder {

        {
            scopes = new LWAClientScopes(new HashSet<>());
        }

        public LWAAuthorizationCredentialsBuilder withScope(String scope) {
            return withScopes(scope);
        }

        public LWAAuthorizationCredentialsBuilder withScopes(String... scopesStr) {
            if (scopesStr != null) {
                Arrays.stream(scopesStr)
                        .forEach(scopes::addScope);
            }
            return this;
        }


    }
    
    public LWAClientScopes getScopes() {
    	if(scopes==null)
    		scopes = new LWAClientScopes(new HashSet<>());
		return scopes;
	}
    
    public String getClientId() {
		return clientId;
	}
    
    public String getClientSecret() {
		return clientSecret;
	}
    
    public String getEndpoint() {
		return endpoint;
	}
    
    public String getRefreshToken() {
		return refreshToken;
	}
    
    public LWAAuthorizationCredentials setClientId(String clientId) {
		this.clientId = clientId;
		return this;
	}
    
    public LWAAuthorizationCredentials setClientSecret(String clientSecret) {
		this.clientSecret = clientSecret;
		return this;
	}
    
    public LWAAuthorizationCredentials setEndpoint(String endpoint) {
		this.endpoint = endpoint;
		return this;
	}
    
    public LWAAuthorizationCredentials setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
		return this;
	}
    
    public LWAAuthorizationCredentials setScopes(LWAClientScopes scopes) {
		this.scopes = scopes;
		return this;
	}

}
