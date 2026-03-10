package com.mainapp;

import java.util.Base64;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import io.jsonwebtoken.Jwts;

@SpringBootTest
class Spb09SpringSecurityApplicationTests {

	@Test
	void contextLoads() {
	}
	
//	@Test
//	void keyTest() {
//		SecretKey secretKey = Jwts.SIG.HS512.key().build();
//		String finalKey = Base64.getEncoder().encodeToString(secretKey.getEncoded());
//		System.out.println("*************" +finalKey+ "************");
//		
//	}

}
