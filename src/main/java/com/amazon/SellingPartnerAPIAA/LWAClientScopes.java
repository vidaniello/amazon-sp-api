package com.amazon.SellingPartnerAPIAA;


import com.google.gson.annotations.JsonAdapter;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@Getter
@JsonAdapter(LWAClientScopesSerializerDeserializer.class)
public class LWAClientScopes {

    private Set<String> scopes;

    public LWAClientScopes() {
		
	}
    
    public LWAClientScopes(Set<String> scopes) {
		super();
		this.scopes = scopes;
	}

	protected void addScope(String scope) {
        scopes.add(scope);

    }

    protected boolean isEmpty() {
        return scopes.isEmpty();
    }

    public Set<String> getScopes() {
		return scopes;
	}

}
