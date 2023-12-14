package com.example.bootstraptodo.todo.services;

import com.example.bootstraptodo.todo.models.Todo;
import com.example.bootstraptodo.todo.repositories.TodoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TodoService {

    @Autowired
    private TodoRepository todoRepository;

    public List<Todo> allTodos() { return todoRepository.findAll(); }

    public Todo findTodoById(Long id) {
        return todoRepository.findTodoById(id);
    }

    public Todo addTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public Todo updateTodo(Todo todo) {
        return todoRepository.save(todo);
    }

    public void deleteTodo(Long id) {
        todoRepository.deleteById(id);
    }
}