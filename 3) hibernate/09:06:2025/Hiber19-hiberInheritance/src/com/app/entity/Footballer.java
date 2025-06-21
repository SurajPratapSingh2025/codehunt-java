package com.app.entity;

import javax.persistence.Entity;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@Entity
public class Footballer extends Player{
	
	
	private int goal;
	private String ftype;
	public Footballer(int id, String name, int goal, String ftype) {
		super(id, name);
		this.goal = goal;
		this.ftype = ftype;
	}
}
