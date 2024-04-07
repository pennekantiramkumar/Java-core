package com.learning.core.day3session3;

import java.util.HashMap;
import java.util.Scanner;

 public class D03P082 {
	    public static void main(String[] args) {
	        // Create a HashMap to store phone book details
	        HashMap<String, String> phoneBook = new HashMap<>();

	        // Add predefined information to the phone book
	        phoneBook.put("Ram", "9959654355");
	        phoneBook.put("Kumar", "937845978");
	        phoneBook.put("Henry", "7730951566");
	        phoneBook.put("Rohit", "8886574562");
	        phoneBook.put("Jessy", "7744289411");

	        // Display the phone book details
	        System.out.println("Phone Book Details:");
	        for (String name : phoneBook.keySet()) {
	            String phoneNumber = phoneBook.get(name);
	            System.out.println(name + " " + phoneNumber);
	        }


	        // Search for a phone number
	        Scanner sc = new Scanner(System.in);
	        System.out.print("\nEnter a name to search for the phone number: ");
	        String searchName = sc.nextLine();
	        if (phoneBook.containsKey(searchName)) {
	            String phoneNumber = phoneBook.get(searchName);
	            System.out.println("Phone number for " + searchName + ": " + phoneNumber);
	        } else {
	            System.out.println("Contact not found.");
	        }

	        // Clear all phone book details
	       /* System.out.print("\nDo you want to clear all phone book details? (yes/no): ");
	        String choice = sc.nextLine().toLowerCase();
	        if (choice.equals("yes")) {
	            phoneBook.clear();
	            System.out.println("All phone book details have been cleared.");
	        } else {
	            System.out.println("Phone book details remain unchanged.");
	        }*/

	        sc.close();
	    }
	


}
