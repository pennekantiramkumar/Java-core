package com.learning.core.day1session1;
import java.util.Scanner;
public class D01P041 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Accept two numbers from the user
	        System.out.print("Enter two numbers in the range from 1 to 40 separated by space: ");
	        int num1 = sc.nextInt();
	        int num2 = sc.nextInt();

	        // Single-dimensional array of five integer elements ranging in value from 1 to 40
	        int[] array = {7, 25, 5, 19, 30};

	        // Check if both inputted values are found in the array
	        boolean found1 = false;
	        boolean found2 = false;

	        for (int i = 0; i < array.length; i++) {
	            if (num1 == array[i]) {
	                found1 = true;
	            }
	            if (num2 == array[i]) {
	                found2 = true;
	            }
	        }

	        // Display the output based on whether both inputted values are found in the array
	        if (found1 && found2) {
	            System.out.println("Its Bingo");
	        } else {
	            System.out.println("Not Found");
	        }
	    }
	}


