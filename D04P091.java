package com.learning.core.day4session4;

import java.util.Scanner;

class D04P091 {
    private String[] stack;
    private int top;
    private int maxSize;

    public D04P091(int maxSize) {
        this.maxSize = maxSize;
        stack = new String[maxSize];
        top = -1;
    }

    public void push(String element) {
        if (top == maxSize - 1) {
            System.out.println("Stack Overflow");
            return;
        }
        stack[++top] = element;
    }

    public String pop() {
        if (top == -1) {
            return "Stack is empty";
        }
        return stack[top--];
    }

    public void display() {
        if (top == -1) {
            System.out.println("Stack is empty");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(stack[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements to push onto the stack: ");
        int numElements = sc.nextInt();
        sc.nextLine(); // consume newline

        D04P091 stack = new D04P091(numElements);

        for (int i = 0; i < numElements; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            String element = sc.nextLine();
            stack.push(element);
        }

        System.out.println("After Pushing " + numElements + " Elements:");
        stack.display();

        System.out.print("Do you want to pop an element from the stack? (yes/no): ");
        String popChoice = sc.nextLine().toLowerCase();
        if (popChoice.equals("yes")) {
            String poppedElement = stack.pop();
            System.out.println("After a Pop: " + poppedElement);
            stack.display();
        } else {
            System.out.println("No elements popped.");
        }

        sc.close();
    }
}
