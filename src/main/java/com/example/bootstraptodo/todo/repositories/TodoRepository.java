package com.example.bootstraptodo.todo.repositories;

import com.example.bootstraptodo.todo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {
    Todo findTodoById(Long id);
}
