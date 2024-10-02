package com.company;

import java.util.*;

public class EmailList {
    private Set<String> set = new TreeSet<>();
    //private List<String> list = new ArrayList<>();

    public void add(String email) {
        // TODO: валидный формат email добавляется, email это строка, она быть может любой
        // TODO принять решение добавлять аргумент email или нет должен этот метод
        //String regexMail = "^[_A-Za-z0-9-\\\\+]+(\\\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\\\.[A-Za-z0-9]+)*(\\\\.[A-Za-z]{2,})$;";
        //String regexMail = "(@)(.+)$";
        String regexMail = "^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$";
        if(email.matches(regexMail)){
            set.add(email.toLowerCase());
            //list.add(email);
        }
    }

    public List<String> getSortedEmails() {
        // TODO: возвращается сортированный список электронных адресов в алфавитном порядке
        return new ArrayList<>(set);
//        Collections.sort(list);
//        return list;
    }
}