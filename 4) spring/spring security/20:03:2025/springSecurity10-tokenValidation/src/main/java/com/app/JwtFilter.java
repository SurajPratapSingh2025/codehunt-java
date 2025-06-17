package com.app;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.OncePerRequestFilter;

import com.app.service.MyService;

@Component
public class JwtFilter extends OncePerRequestFilter{
	
	@Autowired
	private JwtToken jwtToken;
	
	@Autowired
	private MyService userRepo;

	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain)
			throws ServletException, IOException {
		
		String token=request.getHeader("Authorization");
		if(token != null && token.startsWith("Bearer")) {
			//token processing
			token=token.substring(7);
			
			boolean expired=jwtToken.isExpired(token);
			
			if(!expired) {
				String username=jwtToken.getUsernameFromToken(token);
				if(username != null && SecurityContextHolder.getContext().getAuthentication()==null) {
					UserDetails ud=userRepo.loadUserByUsername(username);
					if(ud != null) {
						UsernamePasswordAuthenticationToken up = new UsernamePasswordAuthenticationToken(ud,token,ud.getAuthorities());
						SecurityContextHolder.getContext().setAuthentication(up);
						//every new request-> SecurityContextHolder(EMPTY)
						//member-/api/member
					}
				}else {
					System.out.println("usrename not found in the token");
				}
			}else {
				System.out.println("token is expired");
			}
			
		}
		filterChain.doFilter(request, response);
	}
	
	
}
