package com.bridgelabz.assignment9.AddressBook;

public class AddressDetails {
// defining the variables
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String email;
    private String city;
    private String state;
    private String pincode;

//    constructor to initialise an objects
    public AddressDetails() {
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.city = city;
        this.state = state;
        this.pincode = pincode;
    }
//    getters and setters for each contact field
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

//    to string to return precise values
    @Override
    public String toString() {
        return "Contact details {" +
                "\nFirst Name: " + firstName + "\n" +
                "\nLast Name: " + lastName + "\n" +
                "\nPhone No.: " + phoneNumber + "\n" +
                "\nEmail: " + email + "\n" +
                "\nCity: " + city + "\n" +
                "\nState: " + state + "\n" +
                "\nPincode: " + pincode + "\n" +
                '}';
    }
}