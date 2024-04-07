package com.learning.core.day1session1;

import java.util.Scanner;
public class Month {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter a number between 1 to 12:");
	        int num = scanner.nextInt();
	        scanner.close();

	        String monthName = getMonthName(num);
	        if (monthName != null) {
	            System.out.println(monthName);
	        } else {
	            System.out.println("Invalid input");
	        }
	    }

	    public static String getMonthName(int num) {
	        String[] months = {"January", "February", "March", "April", "May", "June", "July",
	                "August", "September", "October", "November", "December"};

	        if (num >= 1 && num <= 12) {
	            return months[num - 1];
	        } else {
	            return null;
	        }
	    }
	}

