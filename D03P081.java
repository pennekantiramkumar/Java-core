package com.learning.core.day3session3;

import java.util.HashMap;

public class D03P081 {

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

	        // Clear all the phone book details
	      /*  phoneBook.clear();

	        // Display the cleared phone book
	        System.out.println("\nPhone Book Cleared.");

	        // Verify if the phone book is empty
	        if (phoneBook.isEmpty()) {
	            System.out.println("Phone Book is empty now.");
	        } else {
	            System.out.println("Phone Book still contains entries.");
	        }*/
	    }
	


}
