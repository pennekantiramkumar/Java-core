package com.learning.core.day2session2;

import java.util.Scanner;

public class D02P054{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input string
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        // Find minimum deletions
        int minDeletions = findMinDeletions(str);
        System.out.println("Minimum number of deletions to make the string palindrome: " + minDeletions);
    }

    // Function to find minimum number of deletions to make a string palindrome
    public static int findMinDeletions(String str) {
        // Reverse the string
        String revStr = new StringBuilder(str).reverse().toString();

        // Apply longest common subsequence (LCS) algorithm
        int[][] dp = new int[str.length() + 1][revStr.length() + 1];
        for (int i = 1; i <= str.length(); i++) {
            for (int j = 1; j <= revStr.length(); j++) {
                if (str.charAt(i - 1) == revStr.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
                }
            }
        }

        // Minimum deletions = length of string - length of longest palindromic subsequence
        return str.length() - dp[str.length()][revStr.length()];
    }
}

