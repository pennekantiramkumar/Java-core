package com.learning.core.day1session1;

public class D01P042 {
	public static void main(String[] args) {
        // Create the integer array
        int[] All = {3, 2, 4, 5, 6, 4, 5, 7, 3, 2, 3, 4, 7, 1, 2, 0, 0, 0};

        // Compute the sum of elements from index 0 to 14 and store it at element 15
        int sum = 0;
        for (int i = 0; i < 15; i++) {
            sum += All[i];
        }
        All[15] = sum;

        // Compute the average of elements and store it at element 16
        double average = (double) sum / 15;
        All[16] = (int) average;

        // Identify the smallest value from the array and store it at element 17
        int min = All[0];
        for (int i = 1; i < 15; i++) {
            if (All[i] < min) {
                min = All[i];
            }
        }
        All[17] = min;

        // Display the resulting array
        for (int num : All) {
            System.out.print(num);
        }
    }
}


