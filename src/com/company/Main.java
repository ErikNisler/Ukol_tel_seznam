package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args){

        ContactList contactList = new ContactList();

        contactList.addContact(new Contact("+420602111222","Jan","Novak",Category.PRACE));
        contactList.addContact(new Contact("+420212342143","Tomas","Zeleny",Category.PRACE));
        contactList.addContact(new Contact("+420602222345","Jana","Novakova",Category.OSTATNI));
        contactList.addContact(new Contact("+420602553233","Sef",Category.PRACE));
        contactList.addContact(new Contact("+420612533434",	"Rodice - pevna",Category.RODINA));

        /**Na základě celého telefonního čísla vyhledá Kontakt*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("Zadej telefoní číslo a já ti vyplivnu člověka: ");
        String input = scanner.nextLine();

        try {
            contactList.giveMeRecordByTel(input);
        } catch (ContactException c){
            System.err.println("Chyba! " +c.getLocalizedMessage());
        }

        /**Na základě jména nebo příjmení najde seznam záznamů*/
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Zadej jméno nebo příjmení a já ti vyplivnu člověka: ");
        String input2 = scanner.nextLine();

        try {
            contactList.giveMeRecordByName(input2);
        } catch (ContactException c) {
            System.err.println("Chyba! "+c.getLocalizedMessage());
        }

        /**Na základě části telefonního čísla najde seznam záznamů, které obsahuje onu část telefonního čísla*/
        Scanner scanner3 = new Scanner(System.in);
        System.out.println("Zadej část tel. čísla a já ti vyplivnu člověka: ");
        String input3 = scanner.nextLine();

        try {
            contactList.giveMeRecordByPartOfTel(input3);
        } catch (ContactException c) {
            System.err.println("Chyba! "+c.getLocalizedMessage());
        }

    }
}

