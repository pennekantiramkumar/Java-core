package com.learning.core.day1session1;
import java.util.*;
public class D01P043 {
	
	    public static int findFirstRepeatingIndex(int[] arr) {
	        // Create a HashMap to store the frequency of elements and their corresponding indices
	        HashMap<Integer, Integer> map = new HashMap<>();

	        // Iterate through the array
	        for (int i = 0; i < arr.length; i++) {
	            // If the element is already present in the map, return its index
	            if (map.containsKey(arr[i])) {
	                return map.get(arr[i]);
	            }
	            // Otherwise, store the element and its index in the map
	            else {
	                map.put(arr[i], i);
	            }
	        }
	        // If no repeating element is found, return -1
	        return -1;
	    }

	    public static void main(String[] args) {
	        // Input array
	        int[] arr = {7, 10, 5, 3, 4, 3, 5, 6};

	        // Find the index of the first repeating element
	        int index = findFirstRepeatingIndex(arr);

	        // Display the result
	        if (index != -1) {
	            System.out.println("Index of first repeating element: " + index);
	        } else {
	            System.out.println("No repeating element found");
	        }
	    }
	}