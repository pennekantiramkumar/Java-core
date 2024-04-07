package com.learning.core.day3session3;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.TreeSet;

public class D03P084 implements Comparable<D03P084> {
    private int bookId;
    private String title;
    private double price;
    private String author;
    private Date dateOfPublication;

    // Constructor
    public D03P084(int bookId, String title, double price, String author, Date dateOfPublication) {
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

    // Override compareTo method for sorting by author names
    @Override
    public int compareTo(D03P084 other) {
        return this.author.compareTo(other.author);
    }

    public static void main(String[] args) {
        // Create a TreeSet to store Book objects
        TreeSet<D03P084> bookSet = new TreeSet<>();

        // Add predefined information of 5 books
        bookSet.add(new D03P084(1001, "Python Learning  ", 715.0, "  Martic C. Brown", new Date(120, 1, 2))); // Note: Date uses 0-based month
        bookSet.add(new D03P084(1002, "Modern Mainframe ", 295.0, "  Sharad         ", new Date(97, 4, 19)));
        bookSet.add(new D03P084(1003, "Java Programming ", 523.0, "  Gilad Bracha   ", new Date(84, 10, 23)));
        bookSet.add(new D03P084(1004, "Read C++         ", 295.0, "  Henry Harvin   ", new Date(84, 10, 19)));
        bookSet.add(new D03P084(1005, ".Ner Platform    ", 3497.0, " Mark J.Price   ", new Date(84, 2, 6)));

        // Print all the book details sorted by author names
        System.out.println("Book Details Sorted by Author Names (Ascending):");
        for (D03P084 book : bookSet) {
            System.out.println(book);
        }
    }
}
