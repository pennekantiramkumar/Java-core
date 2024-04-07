package com.learning.core.day2session2;
import java.util.Scanner;
public class D02P051 {
	


	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Calculate and display length of the string
	        int length = input.length();
	        System.out.println("Length of the string: " + length);

	        // Convert string to uppercase and display
	        String uppercaseString = input.toUpperCase();
	        System.out.println("Uppercase string: " + uppercaseString);

	        // Check if string is a palindrome
	        boolean isPalindrome = checkPalindrome(input);
	        if (isPalindrome) {
	            System.out.println("The string is a palindrome.");
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }

	    // Function to check if a string is a palindrome
	    public static boolean checkPalindrome(String str) {
	        int left = 0;
	        int right = str.length() - 1;
	        while (left < right) {
	            if (str.charAt(left) != str.charAt(right)) {
	                return false;
	            }
	            left++;
	            right--;
	        }
	        return true;
	    }
}
	


