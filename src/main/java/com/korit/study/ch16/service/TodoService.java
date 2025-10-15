package com.korit.study.ch16.service;

import com.korit.study.ch16.repository.TodoList;
import com.korit.study.ch16.dto.TodoRegisterDto;
import com.korit.study.ch16.entity.Todo;
import com.korit.study.ch16.entity.User;

public class TodoService {

    private TodoList todoList;

    public TodoService(TodoList todoList) {
        this.todoList = todoList;
    }

    public void register(TodoRegisterDto todoRegisterDto) {
        Todo todo = todoRegisterDto.toTodo();
        // 직접 대입은 없다 , 객체 안의 데이터를 쓰기위해서 set을 쓴다
        todo.setId(todoList.generatedTodoId());
        todoList.add(todo);
    }

    public void printAllByUser(User user) {
        Todo[] foundTodos = todoList.findAllByUserId(user.getId());
        for (Todo todo : foundTodos) {
            System.out.println(todo.toString());
        }
    }
}
