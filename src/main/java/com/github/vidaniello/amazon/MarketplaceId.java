package com.github.vidaniello.amazon;

import java.io.Serializable;
import java.util.Objects;

public class MarketplaceId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String country;
	private String id;
	private String countryCode;
	
	
	public MarketplaceId() {
		
	}


	public MarketplaceId(String country, String id, String countryCode) {
		this.country = country;
		this.id = id;
		this.countryCode = countryCode;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getCountryCode() {
		return countryCode;
	}


	public void setCountryCode(String countryCode) {
		this.countryCode = countryCode;
	}
	
	@Override
	public String toString() {
		return "MarketplaceId [country=" + country + ", id=" + id + ", countryCode=" + countryCode + "]";
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MarketplaceId other = (MarketplaceId) obj;
		return Objects.equals(id, other.id);
	}
	
	
	
	

}
