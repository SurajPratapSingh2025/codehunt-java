package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@SuppressWarnings("deprecation")
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{

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
		auth
		.inMemoryAuthentication()
		.withUser("a")
		.password("a")
		.roles("ADMIN")
		.and()
		.withUser("m")
		.password("m")
		.roles("MEMBER");
		
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

}