package com.example.bootstraptodo.todo.repositories;

import com.example.bootstraptodo.todo.models.Todo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface TodoRepository extends JpaRepository<Todo, Long> {

    void deleteById(Long id);

    Optional<Todo> findTodoById(Long id);
}
