package com.mainapp;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.mainapp.entity.AppUserEntity;
import com.mainapp.repository.AppUserRepository;

@SpringBootApplication
public class Spb09SpringSecurityApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cac = SpringApplication.run(Spb09SpringSecurityApplication.class, args);
		AppUserRepository beanAppUser = cac.getBean(AppUserRepository.class);
		PasswordEncoder beanEncoder = cac.getBean(PasswordEncoder.class);
		
		if (beanAppUser.findByUsername("admin").isPresent()) {
			System.out.println("Admin already Exist");
		}else {
			AppUserEntity appUserEntity=new AppUserEntity();
			appUserEntity.setUsername("admin");
			appUserEntity.setPassword(beanEncoder.encode("admin123"));
			appUserEntity.setRole("ROLE_ADMIN");
			appUserEntity.setDatetime(LocalDateTime.now().toString());
			beanAppUser.save(appUserEntity);
			System.out.println("Admin Inserted");
		}
		if (beanAppUser.findByUsername("member").isPresent()) {
			System.out.println("Member already Exist");
		}else {
			AppUserEntity appUserEntity=new AppUserEntity();
			appUserEntity.setUsername("member");
			appUserEntity.setPassword(beanEncoder.encode("member123"));
			appUserEntity.setRole("ROLE_MEMBER");
			appUserEntity.setDatetime(LocalDateTime.now().toString());
			beanAppUser.save(appUserEntity);
			System.out.println("Member Inserted");
		}
		
		
		
		//key generate though main method
//		SecretKey key = Keys.secretKeyFor(io.jsonwebtoken.SignatureAlgorithm.HS512);
//		String secretKey = Base64.getEncoder().encodeToString(key.getEncoded());
//		System.out.println("JWT Secret Key:");
//		System.out.println(secretKey);
		
		
		
		
		
		
		
		
		
		
	}

}
