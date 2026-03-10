package com.mainapp.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.mainapp.entity.AppUserEntity;
@Repository
public interface AppUserRepository extends JpaRepository<AppUserEntity,Integer>{
	
	@Query(value="SELECT * FROM appuser WHERE username = :username", nativeQuery = true)
	Optional<AppUserEntity> findByUsername(@Param("username") String username);
	
}
