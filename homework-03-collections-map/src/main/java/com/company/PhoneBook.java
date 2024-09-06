package com.company;

import java.util.*;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class PhoneBook {

    private Map<String, Set<String>> map = new HashMap<>();

    public void addContact(String name, String phone) {
        // TODO проверь корректность формата имени и телефона
        // TODO (рекомендуется написать отдельные методы для проверки является строка именем/телефоном)
        // TODO если такой номер уже есть в списке, то перезаписать имя абонента

        if (isSName(name) && isPhone(phone)) {
            map = map.entrySet().stream()
                    .peek(entry -> entry.getValue().remove(phone))
                    .filter(entry -> !entry.getValue().isEmpty())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));

            map.putIfAbsent(name, new HashSet<>());
            map.get(name).add(phone);
        }
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

    public boolean isSName(String name) {
        return Pattern.matches("^[a-zA-Zа-яА-ЯёЁ]+$", name);
    }

    public boolean isPhone(String phone) {
        return Pattern.matches("\\d{11}", phone);
    }
}
