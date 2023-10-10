package com.jcdsoft.todo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jcdsoft.todo.model.Todo;

//Srping data Jpa
public interface TodoRepository extends JpaRepository<Todo, Long>{

}
