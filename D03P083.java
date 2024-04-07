package com.learning.core.day3session3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TreeSet;

public class D03P083 implements Comparable<D03P083> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date dateOfPublication;

    // Constructor
    public D03P083(int bookId, String title, double price, String author, Date dateOfPublication) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
        this.author = author;
        this.dateOfPublication = dateOfPublication;
    }

    // Getters
    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public double getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    public Date getDateOfPublication() {
        return dateOfPublication;
    }

    // Override toString method
    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return bookId + " " + title + " " + price + " " + author + " " + dateFormat.format(dateOfPublication);
    }

    // Override hashCode method
    @Override
    public int hashCode() {
        return bookId;
    }

    // Override equals method
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        D03P083 book = (D03P083) obj;
        return bookId == book.bookId;
    }

    // Override compareTo method for natural ordering
    @Override
    public int compareTo(D03P083 other) {
        return Integer.compare(this.bookId, other.bookId);
    }

    public static void main(String[] args) {
        // Create a TreeSet to store Book objects
        TreeSet<D03P083> bookSet = new TreeSet<>();

        // Add predefined information of 5 books
        bookSet.add(new D03P083(1001, "Python Learning ", 715.0,  " Martic C. Brown", new Date(120, 1, 2))); // Note: Date uses 0-based month
        bookSet.add(new D03P083(1002, "Modern Mainframe", 295.0,  " Sharad         ", new Date(97, 4, 19)));
        bookSet.add(new D03P083(1003, "Java Programming", 523.0,  " Gilad Bracha   ", new Date(84, 10, 23)));
        bookSet.add(new D03P083(1004, "Read C++        ", 295.0,  " Henry Harvin   ", new Date(84, 10, 19)));
        bookSet.add(new D03P083(1005, ".Net Platform   ", 3497.0, "Mark J.Price   ", new Date(84, 2, 6)));

        // Print all the book details
        System.out.println("Book Details:");
        for (D03P083 book : bookSet) {
            System.out.println(book);
        }
    }
}
