package com.example.bootstraptodo.todo.controllers;

import com.example.bootstraptodo.todo.models.Todo;
import com.example.bootstraptodo.todo.services.TodoService;
import org.apache.coyote.Response;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/todos")
public class TodoController {

    @Autowired
    private TodoService todoService;

    @GetMapping
    public ResponseEntity<List<Todo>> getAllTodos() {
        List<Todo> todos = todoService.allTodos();
        return new ResponseEntity<List<Todo>>(todos, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Todo> getTodoById(@PathVariable("Id"), Long id) {
        Todo todo = todoService.findTodoById(id);
        return new ResponseEntity<Todo>(todo, HttpStatus.OK);
    }

    @PostMapping
    public Response<Todo> addTodo(@RequestBody Todo todo) {
        Todo newTodo = todoService.addTodo(todo);
        return new ResponseEntity<Todo>(newTodo, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateTodo(@PathVariable("id") Long id) {
        todoService.deleteTodo(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
