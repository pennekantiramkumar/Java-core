package com.learning.core.day4session4;

import java.util.Scanner;

class D04P096 {
    private static final int MAX_SIZE = 5;
    private int[] queue;
    private int front, rear;

    public D04P096() {
        queue = new int[MAX_SIZE];
        front = rear = -1;
    }

    public void enqueue(int element) {
        if ((rear + 1) % MAX_SIZE == front) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = rear = 0;
        } else {
            rear = (rear + 1) % MAX_SIZE;
        }
        queue[rear] = element;
    }

    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeued = queue[front];
        if (front == rear) {
            front = rear = -1;
        } else {
            front = (front + 1) % MAX_SIZE;
        }
        return dequeued;
    }

    public boolean isEmpty() {
        return front == -1;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in circular queue: ");
        int i = front;
        do {
            System.out.print(queue[i] + " ");
            i = (i + 1) % MAX_SIZE;
        } while (i != (rear + 1) % MAX_SIZE);
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        D04P096 circularQueue = new D04P096();

        System.out.print("Enter elements to enqueue  ");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        for (String element : elements) {
            circularQueue.enqueue(Integer.parseInt(element));
        }

        circularQueue.display();

        int removedElement = circularQueue.dequeue();
        if (removedElement != -1) {
            System.out.println("After removing first element:");
            circularQueue.display();
        }

        sc.close();
    }
}
