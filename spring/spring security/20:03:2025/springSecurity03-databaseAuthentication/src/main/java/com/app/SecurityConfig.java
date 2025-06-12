package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.app.service.MyService;

@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private MyService myService;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		http
		.authorizeHttpRequests()
		.antMatchers("/member").hasRole("MEMBER")
		.antMatchers("/admin").hasRole("ADMIN")
		.anyRequest().permitAll()
		.and()
		.httpBasic()
		.and()
		.exceptionHandling()
		.accessDeniedPage("/error/403");
	}
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception{
		
		//from database: myService
		auth.userDetailsService(myService).passwordEncoder(bCryptPasswordEncoder());
		
		
		
//		auth
//		.inMemoryAuthentication()
//		.withUser("admin123")
//		.password("admin123")
//		.roles("ADMIN")
//		.and()
//		.withUser("member123")
//		.password("member333")
//		.roles("MEMBER");
//		
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	
	
	
}