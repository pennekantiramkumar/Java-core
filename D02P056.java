package com.learning.core.day2session2;
import java.util.Scanner;
public class D02P056 {
	
	    public static void main(String[] args) {
	       
	        System.out.print("Enter a string: ");
	        Scanner sc = new Scanner(System.in);
	        String s = sc.nextLine();

	        // Find the length of the longest prefix that is also a suffix
	        int result = longestPrefixSuffixLength(s);

	        // Output the result
	        System.out.println("Length of the longest prefix that is also a suffix: " + result);
	    }

	    public static int longestPrefixSuffixLength(String s) {
	        int n = s.length();
	        for (int len = n - 1; len > 0; len--) {
	            if (s.substring(0, len).equals(s.substring(n - len))) {
	                return len;
	            }
	        }
	        return 0;
	    }
	}

