package com.bridgelabz.assignment9.AddressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management System..!");
        AddressFunctions contact = new AddressFunctions();
        contact.addContact();
        System.out.println("Do you want to edit the contacts ? \nYes/No");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equals("yes") || input.equals("Yes")|| input.equalsIgnoreCase("Y")) {
            contact.editContact();
        } else {
            System.out.println("Thank you..! ");
        }
    }
}