package com.mainapp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.crypto.SecretKey;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jws;
import io.jsonwebtoken.JwtParserBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtGenerator {
	
	private static final String key="udOdZDgx+wINR0Ahz7k/j0X+QN1nbgzrxiF+fM4m6DjsW/rlio7wppJhoswzKW8oTiONMdasYshEKCCIlm06Wg==";

	public String generateToken(UserDetails userDetails) {
		Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
		List roles = new ArrayList();
		for(GrantedAuthority grantedAuthority : authorities) {
			roles.add(grantedAuthority.getAuthority());
		}
		HashMap<String,Object> claims = new HashMap();
		claims.put("roles", roles);
		
		String token = Jwts.builder()
		.claims(claims)
		.subject(userDetails.getUsername())
		.issuedAt(new Date(System.currentTimeMillis()))
		.expiration(new Date(System.currentTimeMillis() + 5*60*60*1000))
		.signWith(generateKey(),Jwts.SIG.HS512)
		.compact()
		;
		return token;
	}
	
	public SecretKey generateKey() {
		SecretKey secretKey = Keys.hmacShaKeyFor(key.getBytes());
		return secretKey;
	}
	
	public Claims getAllInfoFromToken(String token) {
		JwtParserBuilder parser = Jwts.parser();
		Jws<Claims> signedClaims = parser.verifyWith(generateKey()).build().parseSignedClaims(token);
		Claims payload = signedClaims.getPayload();
		return payload;
	}
	
	public boolean isExpired(String token) {
		Claims payload = getAllInfoFromToken(token);
		Date expiration = payload.getExpiration();
		boolean before = expiration.before(new Date());
		return before;
	}
	
	public String getUsername(String token) {
		Claims payload = getAllInfoFromToken(token);
		String username = payload.getSubject();
		return username;
	}
	
	public List<String> getAllRoles(String token) {
		Claims payload=getAllInfoFromToken(token);
		List<String> list = (List<String>) payload.get("roles");
		return list;
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
