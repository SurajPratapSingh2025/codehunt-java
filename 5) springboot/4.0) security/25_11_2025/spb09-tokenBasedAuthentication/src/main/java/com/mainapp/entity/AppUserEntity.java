package com.mainapp.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="appuser")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class AppUserEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String username;	//anything
	private String password;	//anything-->encrypted
	private String role;		//ROLE_anything
	private String datetime;
}
