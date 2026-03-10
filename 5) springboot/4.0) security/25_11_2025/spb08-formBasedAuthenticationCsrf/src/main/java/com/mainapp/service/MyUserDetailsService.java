package com.mainapp.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.mainapp.entity.AppUserEntity;
import com.mainapp.repository.AppUserRepository;

@Service
public class MyUserDetailsService implements UserDetailsService{
	
	@Autowired
	private AppUserRepository appUserRepository;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<AppUserEntity> op = appUserRepository.findByUsername(username);
		if(op.isPresent()) {
			AppUserEntity appUserEntity=op.get();
			UserDetails userDetails=User.builder()
					.username(appUserEntity.getUsername())
					.password(appUserEntity.getPassword())
					.roles(appUserEntity.getRole().replace("ROLE_", ""))
					.build();
			return userDetails;
		}else {
			throw new UsernameNotFoundException("Username Not Found!");
		}
	}

}
