package com.learning.core.day1session1;
import java.util.Scanner;
public class Pattern {
	
 
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the number of rows:");
	        int rows = scanner.nextInt();
	        scanner.close();

	        displayPattern(rows);
	    }

	    public static void displayPattern(int rows) {
	        for (int i = 1; i <= rows; i++) {
	            for (int j = 1; j <= i; j++) {
	                System.out.print(i + " ");
	            }
	            System.out.println(); // Move to the next line
	        }
	    }
	}