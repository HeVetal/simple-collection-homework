package com.company;

import static com.company.ConsoleHelper.*;
import static com.company.Constants.*;

public class PhoneBookApp {
    public void init() {
        PhoneBook phoneBook = new PhoneBook();
        boolean isExit = false;
        while (!isExit) {
            writeMessage(ENTER_NAME_PHONE_COMMAND);
            String in = readString();
            if (in.equals("LIST")) {
                for (String contact : phoneBook.getAllContacts()) {
                    writeMessage(contact);
                }
                writeMessage(System.lineSeparator());

            } else if (phoneBook.isSName(in)) {
                if (!phoneBook.getMap().containsKey(in)) {
                    writeMessage(NOT_NAME_IN_BOOK);
                    writeMessage(ENTER_PHONE + in + "”:");
                    String phone = readString();
                    if (phoneBook.isPhone(phone)) {
                        phoneBook.addContact(in, phone);
                        writeMessage(SAVE_CONTACT + System.lineSeparator());
                    } else {
                        writeMessage(WRONG_FORMAT);
                    }
                } else {
                    for (String name : phoneBook.getContactByName(in)) {
                        writeMessage(name);
                    }
                }
                writeMessage(System.lineSeparator());
            } else if (phoneBook.isPhone(in)) {
                if (phoneBook.getContactByPhone(in).isEmpty()) {
                    writeMessage(NOT_PHONE_IN_BOOK);
                    writeMessage(ENTER_NAME + in + "”:");
                    String name = readString();
                    if (phoneBook.isSName(name)) {
                        phoneBook.addContact(name, in);
                        writeMessage(SAVE_CONTACT + System.lineSeparator());
                    } else {
                        writeMessage(WRONG_FORMAT);
                    }
                } else {
                    writeMessage(phoneBook.getContactByPhone(in) + System.lineSeparator());
                }
            } else {
                writeMessage(WRONG_FORMAT);
                isExit = true;
            }
        }
    }
}
