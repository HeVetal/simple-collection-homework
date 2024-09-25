package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Set;
import java.util.TreeSet;

public class PhoneBookApp {
    public void init() {
        PhoneBook phoneBook = new PhoneBook();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            while (true) {
                ConsoleHelper.writeMessage(Constants.ENTER_NAME_PHONE_COMMAND);
                String in = reader.readLine();
                if (in.equals("LIST")) {
                    for (String contact : phoneBook.getAllContacts()) {
                        ConsoleHelper.writeMessage(contact);
                    }
                    ConsoleHelper.writeMessage(System.lineSeparator());
                } else if (phoneBook.isPhone(in)) {
                    if (phoneBook.getContactByPhone(in).isEmpty()) {
                        ConsoleHelper.writeMessage(Constants.NOT_PHONE_IN_BOOK);
                        ConsoleHelper.writeMessage(Constants.ENTER_NAME + in + "”:");
                        phoneBook.addContact(ConsoleHelper.readString(), in);
                        ConsoleHelper.writeMessage(Constants.SAVE_CONTACT + System.lineSeparator());
                    } else {
                        ConsoleHelper.writeMessage(phoneBook.getContactByPhone(in) + System.lineSeparator());
                    }
                } else if (phoneBook.isSName(in)) {
                    if (phoneBook.getContactByName(in).equals(new TreeSet<>())) {
                        ConsoleHelper.writeMessage(Constants.NOT_NAME_IN_BOOK);
                        ConsoleHelper.writeMessage(Constants.ENTER_PHONE + in + "”:");
                        phoneBook.addContact(in, ConsoleHelper.readString());
                        ConsoleHelper.writeMessage(Constants.SAVE_CONTACT + System.lineSeparator());
                    } else {
                        for (String name : phoneBook.getContactByName(in)) {
                            ConsoleHelper.writeMessage(name);
                        }
                    }
                    ConsoleHelper.writeMessage(System.lineSeparator());
                } else {
                    ConsoleHelper.writeMessage(Constants.WRONG_FORMAT);
                }
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
