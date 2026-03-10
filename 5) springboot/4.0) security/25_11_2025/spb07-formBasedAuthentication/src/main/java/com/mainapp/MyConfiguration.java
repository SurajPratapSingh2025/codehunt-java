package com.mainapp;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class MyConfiguration {
	
	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/admin").hasRole("ADMIN")
		.antMatchers("/member").hasRole("MEMBER")
		.anyRequest().permitAll()
		.and()
		.formLogin()
		.loginPage("/mylogin")
		.loginProcessingUrl("/dologin")
		.usernameParameter("user")
		.passwordParameter("pass")
//		.and()
//		.exceptionHandling()
//		.accessDeniedPage("/unauthorized")
		;
		return http.build();
		
	}
	
	//username & password store in ram i.e. hardcore
//	@Bean
//	InMemoryUserDetailsManager inMemory() {
//		UserDetails admin=User.builder()
//				.username("admin")
//				.password(passwordEncoder().encode("admin123"))
//				.roles("ADMIN")
//				.build();
//		UserDetails member=User.builder()
//				.username("member")
//				.password(passwordEncoder().encode("member123"))
//				.roles("MEMBER")
//				.build();
//		return new InMemoryUserDetailsManager(admin,member);
//		
//	}
	
	@Bean
	PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}
	

	@Bean
	ModelMapper modelMapper() {
		return new ModelMapper();
	}
	
	
}
