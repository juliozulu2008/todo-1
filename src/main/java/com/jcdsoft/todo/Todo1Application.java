package com.jcdsoft.todo;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.jcdsoft.todo.model.Todo;
import com.jcdsoft.todo.repository.TodoRepository;


@SpringBootApplication

public class Todo1Application {
	@Autowired
	private TodoRepository todoRepository;
	@Bean
	public CommandLineRunner init() {
		return new CommandLineRunner() {
			
			@Override
			public void run(String... args) throws Exception {
				Todo todo = new Todo();
				todo.setDescription("Estudar Spring");
				todo.setCreatedDate(LocalDateTime.now());
				todoRepository.save(todo);
			}
		};
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(Todo1Application.class, args);
	}

}
