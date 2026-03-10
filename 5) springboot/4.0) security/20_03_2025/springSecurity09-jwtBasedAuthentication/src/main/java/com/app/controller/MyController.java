package com.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.app.JwtToken;
import com.app.payload.JwtAuthRequest;
import com.app.payload.JwtAuthResponse;

@RestController("/api")
public class MyController {
	
	@Autowired
	private AuthenticationManager authenticationManager;
	
	@Autowired
	private JwtToken jwtToken;

	@PostMapping("/login")
	public ResponseEntity<JwtAuthResponse> login(@RequestBody JwtAuthRequest jwtAuthRequest) {
		String username=jwtAuthRequest.getUsername();
		String password=jwtAuthRequest.getPassword();
		
		UserDetails userDetails=authenticate(username,password);
		String myToken=jwtToken.generateMyToken(userDetails);
		
		JwtAuthResponse jwtAuthResponse=new JwtAuthResponse();
		jwtAuthResponse.setToken(myToken);
		
		return new ResponseEntity<>(jwtAuthResponse,HttpStatus.OK);
		
		
	}
	
	private UserDetails authenticate(String username,String password) {
		UsernamePasswordAuthenticationToken userpass=new UsernamePasswordAuthenticationToken(username,password);
		Authentication authenticate=authenticationManager.authenticate(userpass);
		UserDetails userDetails=(UserDetails) authenticate.getPrincipal();
		return userDetails;
		
	}
	
	@GetMapping("/member")
	public String member() {
		return "member";
	}
	
	@GetMapping("/admin")
	public String admin() {
		return "admin";
	}
	
	
	
}