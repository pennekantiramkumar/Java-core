package com.learning.core.day1session1;

import java.util.Scanner;
public class StudentGrade {
	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the percentage:");
	        double percentage = scanner.nextDouble();
	        scanner.close();

	        String grade = calculateGrade(percentage);
	        System.out.println(grade);
	    }

	    public static String calculateGrade(double percentage) {
	        if (percentage >= 60) {
	            return "A Grade";
	        } else if (percentage >= 45) {
	            return "B Grade";
	        } else if (percentage >= 35) {
	            return "C Grade";
	        } else {
	            return "Fail";
	        }
	    }
	}