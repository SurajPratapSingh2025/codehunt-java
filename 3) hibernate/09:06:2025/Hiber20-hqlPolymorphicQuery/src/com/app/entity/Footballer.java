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
public class Footballer extends Player{
	
	
	private int goal;
	private String ftype;
	public Footballer(int id, String name, int goal, String ftype) {
		super(id, name);
		this.goal = goal;
		this.ftype = ftype;
	}
}
