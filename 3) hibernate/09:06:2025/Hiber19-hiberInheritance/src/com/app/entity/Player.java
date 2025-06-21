package com.app.entity;

import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.MappedSuperclass;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


//@Inheritance(strategy=InheritanceType.JOINED)
//@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
//@Entity
//@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@MappedSuperclass
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Player {
	@Id
	private int id;
	private String name;
}
