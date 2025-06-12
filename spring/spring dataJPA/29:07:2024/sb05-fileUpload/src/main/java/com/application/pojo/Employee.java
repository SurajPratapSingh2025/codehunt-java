package com.application.pojo;

import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
	@Id
	@Min(value=1, message="ERROR:id<1")
	@Max(value=99,message="ERROR:id>99")
	private int id;
	@NotEmpty(message="name can't be empty")
	@NotBlank(message="name can't be blank")
	@Pattern(regexp="^[A-Za-z]+$")
	private String name;
	
	private String address;
	@Min(value=1000, message="ERROR:id<1000")
	@Max(value=9999, message="ERROR:id>9999")
	private int salary;
	@NotNull(message="time can't be null")
	private LocalTime time;
	
	private String myfile;
}
