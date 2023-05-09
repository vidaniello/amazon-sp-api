package com.amazon.SellingPartnerAPIAA;

import lombok.Data;

@Data
class LWAAccessTokenCacheItem {

    private String accessToken;
    private long accessTokenExpiredTime;

    
    public String getAccessToken() {
		return accessToken;
	}
    
    public long getAccessTokenExpiredTime() {
		return accessTokenExpiredTime;
	}
    
    public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
    
    public void setAccessTokenExpiredTime(long accessTokenExpiredTime) {
		this.accessTokenExpiredTime = accessTokenExpiredTime;
	}
}
