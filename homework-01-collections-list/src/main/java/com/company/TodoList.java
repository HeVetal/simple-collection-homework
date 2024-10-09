package com.company;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void add(String todo) {
        // TODO: добавьте переданное дело в конец списка
        list.add(todo);
    }

    public void add(int index, String todo) {
        // TODO: добавьте дело на указанный индекс,
        //  проверьте возможность добавления
        if (index < list.size() - 1) {
            list.add(index, todo);
        } else {
            list.add(todo);
        }
    }

    public void edit(int index, String todo) {
        // TODO: заменить дело на index переданным todo индекс,
        //  проверьте возможность изменения
        if (index >= 0 && index < list.size()) {
            list.set(index, todo);
        }
    }

    public void delete(int index) {
        // TODO: удалить дело находящееся по переданному индексу,
        //  проверьте возможность удаления дела
        if (checkIndex(index)) {
            list.remove(index);
        }
    }

    public ArrayList<String> getTodos() {
        // TODO: вернуть список дел
        return new ArrayList<>(list);
    }

    private boolean checkIndex(int index) {
        return index >= 0 && index < list.size() - 1;
    }

}