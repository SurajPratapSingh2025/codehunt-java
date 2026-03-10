package com.app.payload;

import lombok.Data;

@Data
public class JwtAuthResponse {
	private String token;

	public void setToken(String myToken) {
		
	}
}
