package com.amazon.SellingPartnerAPIAA;

import lombok.Builder;
import lombok.Data;

/**
 * AWSAuthenticationCredentialsProvider
 */
@Data
@Builder
public class AWSAuthenticationCredentialsProvider {
    /**
     * AWS IAM Role ARN
     */
    private String roleArn;

    /**
     * AWS IAM Role Session Name
     */
    private String roleSessionName;

    private String region;
    
    public String getRegion() {
		return region;
	}
    
    public String getRoleArn() {
		return roleArn;
	}
    
    public String getRoleSessionName() {
		return roleSessionName;
	}
    
    public void setRegion(String region) {
		this.region = region;
	}
    
    public void setRoleArn(String roleArn) {
		this.roleArn = roleArn;
	}
    
    public void setRoleSessionName(String roleSessionName) {
		this.roleSessionName = roleSessionName;
	}
}
