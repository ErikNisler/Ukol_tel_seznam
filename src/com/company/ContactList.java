package com.company;

import java.util.ArrayList;

public class ContactList {
    ArrayList<Contact> listOfContacts = new ArrayList<>();

    public void addContact(Contact contact){
        listOfContacts.add(contact);
    }

    public void removeContact(Contact contact){
        listOfContacts.remove(contact);
    }

    public void giveMeRecordByTel(String input) throws ContactException{
        boolean isIn = false;
        for (Contact contact: listOfContacts) {
            if (contact.getTelNum().equals(input)) {
                isIn = true;
                System.out.println(contact.getAll());
            }
        }
        if (!isIn){
           throw new ContactException("Zadané číslo neodpovídá žádnému kontaktu!");
        }
    }

    public void giveMeRecordByName(String input) throws ContactException{
        for (Contact contact : listOfContacts) {
            if (contact.getLastName() == null) {
                if (contact.getFirstName().equals(input)) {
                    System.out.println(contact.getAll());
                }
            } else if (contact.getFirstName().equals(input) || contact.getLastName().equals(input)) {
                System.out.println(contact.getAll());
            } else {
                throw new ContactException("Zadané jméno či příjmení neodpovídá žádnému kontaktu!");
            }
        }
    }

    public void giveMeRecordByPartOfTel(String input) throws ContactException {
        for (Contact contact : listOfContacts) {
            if (contact.getTelNum().contains(input)) {
                System.out.println(contact.getAll());
            } else {
                throw new ContactException("Zadaná část tel. čísla neodpovídá žádnému kontaktu!");
            }
        }
    }
}
