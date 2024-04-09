package com.learning.core.day4session4;

import java.util.Scanner;

class D04P10C {
    public static boolean linearSearch(int[] arr, int target) {
        for (int num : arr) {
            if (num == target) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the element to search: ");
        int target = sc.nextInt();

        boolean found = linearSearch(arr, target);

        if (found) {
            System.out.println("Element is Present.");
        } else {
            System.out.println("Element is Not Present.");
        }

        sc.close();
    }
}

