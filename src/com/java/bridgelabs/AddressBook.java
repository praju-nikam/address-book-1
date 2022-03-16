package com.java.bridgelabs;

import java.util.Scanner;

public class AddressBook {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("*-*-*-*-*-*- Welcome to Address Book -*-*-*-*-*-*-");


        AddressBook addressBook = new AddressBook();  // Create object
        int choice;
        do {
            System.out.println("1. Add New Contacts \n 2. Edit Contacts \n 3. Delete Contacts \n 4. Display Contacts ");
            System.out.println(" Please Select the Option");
            choice = addressBook.scanner.nextInt();

            switch (choice) {
                case 1:
                    // Add new Contact
                    addressBook.addNewContacts();
                    break;
//                case 2:
//                    // Edit  Contact
//                    addressBook.editContacts();
//                    break;
//
//                case 3:
//                    // Delete  Contact
//                    addressBook.deleteContacts();
//                    break;
//
//                case 4:
//                    // Display  Contact
//                    addressBook.displayContacts();
//                    break;

                default:
                    System.out.println("Please Enter the Option 1 to 4");
                    break;

            }
        }
        while (choice != 4) ;
    }

    // Create Contacts Object for Getter & Setter method
    Contact contact = new Contact();

    // Add New contacts to AddressBook
    public void addNewContacts()
    {
        System.out.println("Enter Contacts Details : ");
        System.out.println("Enter First Name : ");
        contact.setFirstName(scanner.next());
        System.out.println("Enter Last Name : ");
        contact.setLastName(scanner.next());
        System.out.println("Enter The Address : ");
        contact.setAddress(scanner.next());
        System.out.println("Enter the City : ");
        contact.setCity(scanner.next());
        System.out.println("Enter the State : ");
        contact.setState(scanner.next());
        System.out.println("Enter the Zip Code : ");
        contact.setZip(scanner.next());
        System.out.println("Enter the Phone Number : ");
        contact.setPhoneNo(scanner.next());
        System.out.println("Enter the Email Id : ");
        contact.setEmailId(scanner.next());

    }
    // Display the Contacts Details
    public void displayContacts()
    {
        if(contact.getFirstName() == null)
        {
            System.out.println("Contact Details Not Available");
        }
        else
        {
            System.out.println("Contact Details : ");
            System.out.println("First Name : " + contact.getFirstName());
            System.out.println("Last Name : " + contact.getLastName());
            System.out.println("Address : " + contact.getAddress());
            System.out.println("City : " + contact.getAddress());
            System.out.println("State : " + contact.getState());
            System.out.println("Zip Code : " + contact.getZip());
            System.out.println("Phone Number : " + contact.getPhoneNo());
            System.out.println("Email Id : " + contact.getEmailId());
            System.out.println("");
        }
    }




}
