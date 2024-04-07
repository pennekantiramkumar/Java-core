package com.learning.core.day2session2;
import java.util.Scanner;
public class D02P052 {
	

	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input string
	        System.out.print("Enter a string: ");
	        String input = sc.nextLine();

	        // Input number of last 'n' vowels to count
	        System.out.print("Enter the number of last 'n' vowels to count: ");
	        int n = sc.nextInt();

	        // Count the last 'n' vowels
	        int vowelCount = countLastNVowels(input, n);

	        // Print the count of last 'n' vowels
	        System.out.println("Count of last 'n' vowels: " + vowelCount);

	        // Check if the count is greater than vowels found
	        if (vowelCount < 0) {
	            System.out.println("Mismatch in vowel count.");
	        }
	    }

	    // Function to count the last 'n' vowels in the string
	    public static int countLastNVowels(String str, int n) {
	        int count = 0;
	        int vowelCount = 0;
	        for (int i = str.length() - 1; i >= 0 && count < n; i--) {
	            char ch = Character.toLowerCase(str.charAt(i));
	            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
	                vowelCount++;
	                count++;
	            }
	        }
	        if (count < n) {
	            return -1; // Indicates a mismatch in vowel count
	        }
	        return vowelCount;
	    }
	


}
