package com.company;

import java.util.*;
import java.util.regex.Pattern;

public class PhoneBook {

    private Map<String,Integer> map = new HashMap<>();

//    public Map<String, Integer> getMap() {
//        return map;
//    }

    public void addContact(String name, String phone) {
        // TODO проверь корректность формата имени и телефона
        // TODO (рекомендуется написать отдельные методы для проверки является строка именем/телефоном)
        // TODO если такой номер уже есть в списке, то перезаписать имя абонента
    }

    public Set<String> getContactByName(String name) {
        // TODO формат одного контакта "Имя - Телефон"
        // TODO если контакт не найден - вернуть пустой TreeSet
        return new TreeSet<>();
    }

    public String getContactByPhone(String phone) {
        // TODO формат одного контакта "Имя - Телефон"
        // TODO если контакт не найдены - вернуть пустую строку
        return "";
    }

    public Set<String> getAllContacts() {
        // TODO формат одного контакта "Имя - Телефон"
        // TODO если контактов нет в телефонной книге - вернуть пустой TreeSet

        return new TreeSet<>();
    }

    public boolean isSName(String name){
        return Pattern.matches("[a-zA-Z]+", name);
    }

    public boolean isNumber(String phone){
        return Pattern.matches("\\d+", phone);
    }
}
