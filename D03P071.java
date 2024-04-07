package com.learning.core.day3session3;
import java.util.ArrayList;
import java.util.Scanner;

public class D03P071 {
		
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        // Create an ArrayList to store student names
	        ArrayList<String> studentNames = new ArrayList<>();

	        // Input student names from the user
	        System.out.println("Enter student names separated by spaces:");
	        String input = sc.nextLine();
	        String[] names = input.split(" ");

	        // Add names to the ArrayList
	        for (String name : names) {
	            studentNames.add(name);
	        }

	        // Input the name to search
	        System.out.println("Enter the name to search:");
	        String searchName = sc.nextLine();

	        // Check if the name exists in the list
	        boolean found = studentNames.contains(searchName);

	        // Display the result
	        if (found) {
	            System.out.println("Found");
	        } else {
	            System.out.println("Not Found");
	        }

	        sc.close();
	    }
	

}
