package com.app.entity;

import javax.persistence.Entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Cricketer extends Player{
	
	
	private int run;
	private String ctype;
	public Cricketer(int id, String name, int run, String ctype) {
		super(id, name);
		this.run = run;
		this.ctype = ctype;
	}
}
