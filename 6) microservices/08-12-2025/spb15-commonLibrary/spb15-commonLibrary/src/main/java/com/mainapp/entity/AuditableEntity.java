package com.mainapp.entity;

import java.time.LocalDateTime;

import javax.persistence.MappedSuperclass;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@MappedSuperclass
public class AuditableEntity {
	
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

}
