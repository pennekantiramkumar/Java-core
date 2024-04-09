package com.learning.core.day4session4;

import java.util.Scanner;

class Node1{
    int data;
    Node1 next;

    Node1(int data) {
        this.data = data;
        this.next = null;
    }
}

class D04P095 {
    private Node front, rear;

    public D04P095() {
        front = rear = null;
    }

    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) {
            front = rear = newNode;
            return;
        }
        rear.next = newNode;
        rear = newNode;
    }

    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty");
            return -1;
        }
        int dequeued = (int) front.data;
        front = front.next;
        if (front == null) {
            rear = null;
        }
        return dequeued;
    }

    public void display() {
        if (front == null) {
            System.out.println("Queue is empty");
            return;
        }
        System.out.print("Elements in Queue: ");
        Node current = front;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        D04P095 queue = new D04P095();

        System.out.print("Enter elements to enqueue (separated by space): ");
        String input = sc.nextLine();
        String[] elements = input.split(" ");
        for (String element : elements) {
            queue.enqueue(Integer.parseInt(element));
        }

        queue.display();

        System.out.print("Enter the number of elements to dequeue: ");
        int numDequeue = sc.nextInt();
        for (int i = 0; i < numDequeue; i++) {
            queue.dequeue();
        }

        System.out.println("After removing " + numDequeue + " elements:");
        queue.display();

        sc.close();
    }
}
