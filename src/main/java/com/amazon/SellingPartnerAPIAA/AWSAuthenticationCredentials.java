package com.amazon.SellingPartnerAPIAA;

import lombok.Builder;
import lombok.Data;
import lombok.NonNull;

/**
 * AWSAuthenticationCredentials
 */
@Data
@Builder
public class AWSAuthenticationCredentials {
    /**
     * AWS IAM User Access Key Id
     */
    @NonNull
    private String accessKeyId;

    /**
     * AWS IAM User Secret Key
     */
    @NonNull
    private String secretKey;

    /**
     * AWS Region
     */
    @NonNull
    private String region;
    
    public String getAccessKeyId() {
		return accessKeyId;
	}
    
    public String getRegion() {
		return region;
	}
    
    public String getSecretKey() {
		return secretKey;
	}
    
    public void setAccessKeyId(String accessKeyId) {
		this.accessKeyId = accessKeyId;
	}
    
    public void setRegion(String region) {
		this.region = region;
	}
    
    public void setSecretKey(String secretKey) {
		this.secretKey = secretKey;
	}
}
