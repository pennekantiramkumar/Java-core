package com.learning.core.day2session2;

import java.util.Scanner;
public class D02P059 { 

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = scanner.nextLine();

        // Replace spaces with '%20'
        String replacedString = replaceSpaces(str);

        // Output the replaced string
        System.out.println("Replaced string: " + replacedString);
    }

    public static String replaceSpaces(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (ch == ' ') {
                sb.append("%20");
            } else {
                sb.append(ch);
            }
        }

        return sb.toString();
    }
}



