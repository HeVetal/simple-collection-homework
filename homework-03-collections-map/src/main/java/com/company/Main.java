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
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}