package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    protected PhoneBook phoneBook;

    public static void main(String[] args) {
        PhoneBook phoneBook = new PhoneBook();

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            String in = reader.readLine();
            if (in.equals("LIST")) {
                phoneBook.getAllContacts();
            } else if (phoneBook.isNumber(in)) {
                phoneBook.getContactByPhone(in);
            } else if (phoneBook.isSName(in)) {
                phoneBook.getContactByName(in);
            } else {
                System.out.println("Неверный формат ввода");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}