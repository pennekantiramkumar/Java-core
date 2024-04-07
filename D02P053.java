package com.learning.core.day2session2;
import java.util.*;
public class D02P053 {


	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String str = sc.nextLine();

	        // Print all subsequences
	        System.out.println("Subsequences of the string:");
	        printSubsequences(str);
	    }

	    // Function to print all subsequences of a string
	    public static void printSubsequences(String str) {
	        printSubsequencesHelper(str, "", 0);
	    }

	    // Helper function to recursively generate all subsequences
	    private static void printSubsequencesHelper(String str, String current, int index) {
	        if (index == str.length()) {
	            System.out.println(current);
	            return;
	        }
	        // Include the current character
	        printSubsequencesHelper(str, current + str.charAt(index), index + 1);
	        // Exclude the current character
	        printSubsequencesHelper(str, current, index + 1);
	    }
	
}
