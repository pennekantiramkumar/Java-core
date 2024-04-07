package com.learning.core.day2session2;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class D02P058 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Check if the string can be split into four distinct strings
        boolean result = canSplitIntoFourDistinctStrings(str);

        // Output the result
        if (result) {
            System.out.println("Yes, the string can be split into four distinct strings.");
        } else {
            System.out.println("No, the string cannot be split into four distinct strings.");
        }
    }

    public static boolean canSplitIntoFourDistinctStrings(String str) {
        if (str.length() < 4) {
            return false;
        }

        Set<String> set = new HashSet<>();

        for (int i = 1; i <= str.length() - 3; i++) {
            for (int j = i + 1; j <= str.length() - 2; j++) {
                for (int k = j + 1; k <= str.length() - 1; k++) {
                    String s1 = str.substring(0, i);
                    String s2 = str.substring(i, j);
                    String s3 = str.substring(j, k);
                    String s4 = str.substring(k);

                    set.clear();
                    set.add(s1);
                    set.add(s2);
                    set.add(s3);
                    set.add(s4);

                    if (set.size() == 4) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}


