package com.learning.core.day4session4;

import java.util.Scanner;

class Node {
    double data;
    Node next;

    Node(double data) {
        this.data = data;
        this.next = null;
    }
}

class StackLinkedList {
    private Node top;

    StackLinkedList() {
        this.top = null;
    }

    public void push(double data) {
        Node newNode = new Node(data);
        newNode.next = top;
        top = newNode;
    }

    public double pop() {
        if (top == null) {
            System.out.println("Stack is empty");
            return Double.NaN; // Returning NaN (Not a Number) to indicate empty stack
        }
        double popped = top.data;
        top = top.next;
        return popped;
    }

    public void display() {
        if (top == null) {
            System.out.println("Stack is empty");
            return;
        }
        Node current = top;
        System.out.print("The elements of stack are: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println("null");
    }
}

public class D04P092 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        StackLinkedList stack = new StackLinkedList();

        System.out.println("Enter elements to push onto the stack separated by space:");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        for (String element : elements) {
            stack.push(Double.parseDouble(element));
        }

        System.out.print(" ");
        stack.display();

        // Pop twice
        stack.pop();
        stack.pop();
        System.out.print("After Popping twice: ");
        stack.display();

        sc.close();
    }
}

