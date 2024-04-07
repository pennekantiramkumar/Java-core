package com.learning.core.day2session2;
import java.util.*;
public class D02P057 {
	
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        // Input dictionary and pattern
	        System.out.println("Enter the dictionary (words separated by spaces):");
	        String[] dictionary = sc.nextLine().split(" ");
	        System.out.print("Enter the pattern: ");
	        String pattern = sc.next();

	        // Find all strings that match the pattern
	        List<String> matches = findPatternMatches(dictionary, pattern);

	        // Output the matches
	        System.out.println("Strings that match the pattern:");
	        for (String match : matches) {
	            System.out.println(match);
	        }
	    }

	    public static List<String> findPatternMatches(String[] dictionary, String pattern) {
	        List<String> matches = new ArrayList<>();
	        for (String word : dictionary) {
	            if (matchesPattern(word, pattern)) {
	                matches.add(word);
	            }
	        }
	        return matches;
	    }

	    private static boolean matchesPattern(String word, String pattern) {
	        if (word.length() != pattern.length()) {
	            return false;
	        }
	        Map<Character, Character> mapping = new HashMap<>();
	        Set<Character> used = new HashSet<>();
	        for (int i = 0; i < word.length(); i++) {
	            char c = word.charAt(i);
	            char p = pattern.charAt(i);
	            if (mapping.containsKey(p)) {
	                if (mapping.get(p) != c) {
	                    return false;
	                }
	            } else {
	                if (used.contains(c)) {
	                    return false;
	                }
	                mapping.put(p, c);
	                used.add(c);
	            }
	        }
	        return true;
	    }
	


}
