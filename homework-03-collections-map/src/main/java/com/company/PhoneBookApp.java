package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PhoneBookApp {
    public void init(){
        PhoneBook phoneBook = new PhoneBook();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                ConsoleHelper.writeMessage("Введите номер, имя или команду:" );
                String in = reader.readLine();
                if (in.equals("LIST")) {
                    phoneBook.getAllContacts();
                } else if (phoneBook.isPhone(in)) {
                    phoneBook.getContactByPhone(in);
                } else if (phoneBook.isSName(in)) {
                    phoneBook.getContactByName(in);
                } else {
                    ConsoleHelper.writeMessage("Неверный формат ввода");
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
