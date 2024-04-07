package com.learning.core.day1session1;

import java.util.Scanner;

public class Weekday {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 to 7:");
        int num = scanner.nextInt();
        scanner.close();

        String weekday = getWeekday(num);
        if (weekday != null) {
            System.out.println(weekday);
        } else {
            System.out.println("Invalid input");
        }
    }

    public static String getWeekday(int num) {
        if (num == 1) {
            return "Sunday";
        } else if (num == 2) {
            return "Monday";
        } else if (num == 3) {
            return "Tuesday";
        } else if (num == 4) {
            return "Wednesday";
        } else if (num == 5) {
            return "Thursday";
        } else if (num == 6) {
            return "Friday";
        } else if (num == 7) {
            return "Saturday";
        } else {
            return null;
        }
    }
}
