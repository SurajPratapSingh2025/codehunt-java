package com.app;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.crypto.SecretKey;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

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
	
	private SecretKey getKey() {
		byte[] bytes=SECRET_KEY.getBytes();
		SecretKey key=Keys.hmacShaKeyFor(bytes);
		return key;
	}
	
	//============================token mining=================================
	
	public Jws<Claims> getAllClaimsFromToken(String token) {
		JwtParserBuilder parser= Jwts.parser();
		Jws<Claims> claims=parser.verifyWith(getKey()).build().parseSignedClaims(token);
		
		return claims;
	}
	
	public String getUsernameFromToken(String token) {
		return getAllClaimsFromToken(token).getPayload().getSubject();
	}
	
	public boolean isExpired(String token) {
		Date expiration=getAllClaimsFromToken(token).getPayload().getExpiration();
		return expiration.before(new Date());
	}
	
	
}


