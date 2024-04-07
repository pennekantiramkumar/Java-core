package com.learning.core.day1session1;

import java.util.Scanner;
public class Factorial {
	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number:");
	        int number = scanner.nextInt();
	        scanner.close();

	        long factorial = calculateFactorial(number);
	        System.out.println("Factorial of " + number + " is: " + factorial);
	    }

	    public static long calculateFactorial(int number) {
	        if (number < 0) {
	            System.out.println("Factorial is not defined for negative numbers.");
	            return -1; // Returning -1 to indicate an error
	        }

	        long factorial = 1;
	        for (int i = 1; i <= number; i++) {
	            factorial *= i;
	        }
	        return factorial;
	    }
	}
