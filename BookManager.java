package com.learning.core.day1session1;

public class BookManager {
	 public static void main(String[] args) {
	        // Creating books
	        Book[] books = createBooks();

	        // Displaying books
	        showBooks(books);
	    }

	    // Method to create an array of books
	    public static Book[] createBooks() {
	        Book[] books = new Book[1];
	        books[0] = new Book("Java Programming", 350.00);
	        return books;
	    }

	    // Method to display books
	    public static void showBooks(Book[] books) {
	        System.out.println("Output:");
	        for (Book book : books) {
	            System.out.println("Book Title: " + book.getTitle() + " and Price: " + book.getPrice());
	        }
	    }

}
