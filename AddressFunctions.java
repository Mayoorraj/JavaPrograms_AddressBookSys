package com.bridgelabz.assignment9.AddressBook;
/*
 *@author Mayoor
 */
import java.util.Scanner;

public class AddressFunctions {
    //  created an object of Addressdetails
    AddressDetails addressDetails;
    Scanner sc = new Scanner(System.in);

    //  method for adding contact details
    public void addContact() {
        System.out.println("Adding/editing a contact details in this address book..");
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

//  implementing setters for creating fields in a contact
        addressDetails.setFirstName(firstName);
        addressDetails.setLastName(lastName);
        addressDetails.setPhoneNumber(phoneNumber);
        addressDetails.setCity(city);
        addressDetails.setState(state);
        addressDetails.setPincode(pincode);
        addressDetails.setEmail(email);
        System.out.println(addressDetails);
    }
//  editing the exisitng address
    public void editContact() {
        System.out.println("Please Enter the first name of a contact person to edit : ");
        String editName = sc.nextLine();

        if (editName.equalsIgnoreCase(addressDetails.getFirstName())) {
            System.out.println("Found a contact stored with this name..");
            addContact();
        }
        else {
            System.out.println("Please check the spelling, Invalid first name" +
                    "\nthe name you entered does not match with any names in address book " +
                    "\nTry again..");
            editContact();
        }
    }
}