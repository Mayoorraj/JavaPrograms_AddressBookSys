package com.bridgelabz.assignment9.AddressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to Address Book Management System..!");
        AddressFunctions contact = new AddressFunctions();
        contact.addContact();

        System.out.println("Do you want to edit or delete contacts ? \nEdit/Delete");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        if (input.equalsIgnoreCase("E")|| input.equalsIgnoreCase("edit")){
            contact.editContact();
        }
        else if (input.equalsIgnoreCase("D")||input.equalsIgnoreCase("delete")) {
            contact.deleteContact();
        }
        else {
            System.out.println(" Thank you..! ");
        }
    }
}