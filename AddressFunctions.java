package com.bridgelabz.assignment9.AddressBook;

import java.util.Scanner;

public class AddressFunctions {

    AddressDetails addressDetails;
    Scanner sc = new Scanner(System.in);

    public void addContact() {
        addressDetails = new AddressDetails();
        System.out.println("Enter the first name : ");
        String firstName = sc.nextLine();
        System.out.println("Enter the last name : ");
        String lastName = sc.nextLine();
        System.out.println("Enter the phone no : ");
        String phoneNumber = sc.nextLine();
        System.out.println("Enter the city : ");
        String city = sc.nextLine();
        System.out.println("Enter the state : ");
        String state = sc.nextLine();
        System.out.println("Enter the pincode : ");
        String pincode = sc.nextLine();
        System.out.println("Enter Email id : ");
        String email = sc.nextLine();

        addressDetails.setFirstName (firstName);
        addressDetails.setLastName(lastName);
        addressDetails.setPhoneNumber(phoneNumber);
        addressDetails.setCity(city);
        addressDetails.setState(state);
        addressDetails.setPincode(pincode);
        addressDetails.setEmail(email);
        System.out.println(addressDetails);

    }

    public void display() {
        String str = addressDetails.getFirstName();
        System.out.println("str = " + str);
    }
}
