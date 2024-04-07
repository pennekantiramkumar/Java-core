package com.learning.core.day2session2;
import java.util.*;
public class D02P055 {
	
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input number of strings
	        System.out.print("Enter the number of strings: ");
	        int n = sc.nextInt();
	        sc.nextLine(); // Consume newline

	        // Input array of strings
	        System.out.println("Enter the strings:");
	        String[] strings = new String[n];
	        for (int i = 0; i < n; i++) {
	            strings[i] = sc.next();
	        }

	        // Check if strings can be chained to form a circle
	        boolean result = canFormCircle(strings);

	        // Output the result
	        if (result) {
	            System.out.println("Yes");
	        } else {
	            System.out.println("No");
	        }
	    }

	    // Function to check if strings can be chained to form a circle
	    public static boolean canFormCircle(String[] strings) {
	        return canFormCircleHelper(strings, new HashSet<>(), strings[0], 1);
	    }

	    // Helper function for backtracking
	    private static boolean canFormCircleHelper(String[] strings, Set<Integer> visited, String currentString, int count) {
	        if (count == strings.length) {
	            return currentString.charAt(currentString.length() - 1) == strings[0].charAt(0);
	        }
	        for (int i = 1; i < strings.length; i++) {
	            if (!visited.contains(i) && currentString.charAt(currentString.length() - 1) == strings[i].charAt(0)) {
	                visited.add(i);
	                if (canFormCircleHelper(strings, visited, strings[i], count + 1)) {
	                    return true;
	                }
	                visited.remove(i);
	            }
	        }
	        return false;
	    }
	}
