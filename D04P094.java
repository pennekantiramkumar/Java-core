package com.learning.core.day4session4;

import java.util.Scanner;

class D04P094 {
    private static final int MAX_SIZE = 100;
    private int[] queue;
    private int front, rear;

    public D04P094() {
        queue = new int[MAX_SIZE];
        front = 0;
        rear = -1;
    }

    public void enqueue(int element) {
        if (rear == MAX_SIZE - 1) {
            System.out.println("Queue is full");
            return;
        }
        queue[++rear] = element;
    }

    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeued = queue[front++];
        return dequeued;
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in queue: ");
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        D04P094 queue = new D04P094();

        System.out.print("Enter elements to enqueue (separated by space): ");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        for (String element : elements) {
            queue.enqueue(Integer.parseInt(element));
        }

        queue.display();

        int removedElement = queue.dequeue();
        if (removedElement != -1) {
            System.out.println("After removing first element: ");
            queue.display();
        }

        sc.close();
    }
}
