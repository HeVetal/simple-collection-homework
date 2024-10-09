package com.company;

import java.util.ArrayList;

import static com.company.ConsoleHelper.*;
import static com.company.Constants.*;

public class TodoListApp {
    public void init() {
        TodoList todoList = new TodoList();
        String command = readString();
        String[] strings = command.split(" ", 2);
        for (String string : strings) {
            System.out.println(string);
        }
        String deal = "";
        if (strings[1].trim().matches("^-?\\d+$")) {
            deal = command.substring(strings[0].length() + strings[1].length() + 2);
            System.out.println("tut");
        } else {
            deal = command.substring(strings[0].length());
            System.out.println("not dij");
        }
        switch (strings[0]) {
            case LIST -> {
                ArrayList<String> todos = todoList.getTodos();
                for (int i = 0; i < todos.size(); i++) {
                    writeMessage(i + todos.get(i));
                }
            }
            case ADD -> {
                if (command.matches("-?\\d+")) {
                    todoList.add(Integer.parseInt(strings[1]), deal);
                } else {
                    todoList.add(deal);
                }
                writeMessage(ADD_DEAL + deal);
            }
            case EDIT -> {
                todoList.edit(Integer.parseInt(strings[1]), deal);
                writeMessage(DEAL + todoList.getList().get(Integer.parseInt(strings[1])) + REPLACE + deal + "\"");
            }
            case DELETE -> {
                if (!(todoList.getTodos().size() < Integer.parseInt(strings[1]))) {
                    todoList.delete(Integer.parseInt(strings[1]));
                } else {
                    writeMessage(NOT_EXIST);
                }
            }
            default -> writeMessage(WRONG_FORMAT);
        }
    }
}
