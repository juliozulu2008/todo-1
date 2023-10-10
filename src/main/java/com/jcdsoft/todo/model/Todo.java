package com.jcdsoft.todo.model;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity // entidade do banco de dados
@Getter
@Setter
public class Todo {
	
	@Id // utiliza id como controlle
	@GeneratedValue(strategy = GenerationType.IDENTITY)  // gera os ids automaticamente e delega ao banco
	private long id;
	@Column
	private String description;
	@Column
	private Boolean done;
	@Column
	private LocalDateTime createdDate;
	@Column
	private LocalDateTime doneDate;
	
	
}
