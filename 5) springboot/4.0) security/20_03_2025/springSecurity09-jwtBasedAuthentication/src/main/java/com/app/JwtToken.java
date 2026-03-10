package com.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
@Component
public class JwtToken{
	
//	private static final long JWT_VALIDITY=6*60*60;
//	private static final String SECRET_KEY="rajuhsrabsrbafbfvxfnkhmhgi2ik8mtbarbtvvzcdyvdnfxrnbsybtxfvdxfbjghmdzbvtkaju";
	
	@Value("${jwt.token.validity}")
	private long JWT_VALIDITY;
	
	@Value("${jwt.secret}")
	private String SECRET_KEY;
	
	
	
	
	
	public String generateMyToken(UserDetails userDetails) {
		List<String> role=new ArrayList<>();
		for(GrantedAuthority grantedAuthority : userDetails.getAuthorities()) {
			role.add(grantedAuthority.getAuthority());
		}
		Map<String,Object> claims=new HashMap<>();
		claims.put("roles",role);
		
		String token=Jwts.builder()
		.setClaims(claims)
		.setSubject(userDetails.getUsername())
		.setIssuedAt(new Date(System.currentTimeMillis()))
		.setExpiration(new Date(System.currentTimeMillis()+JWT_VALIDITY*1000))
		.signWith(SignatureAlgorithm.HS512,SECRET_KEY)
		.compact();
		
		return token
		;
		
	}
}


