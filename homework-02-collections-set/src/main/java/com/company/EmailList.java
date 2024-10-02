package com.company;

import java.util.*;

public class EmailList {
    private Set<String> set;

    public EmailList() {
        set = new TreeSet<>();
    }

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // TODO принять решение добавлять аргумент email или нет должен этот метод
        if (isValidate(email)) {
            set.add(email.toLowerCase());
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(set);
    }

    private boolean isValidate(String email) {
        String regexMail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        return email.matches(regexMail);
    }
}