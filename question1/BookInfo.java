package com.assignment9.question1;

import java.util.Scanner;

public class BookInfo {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b=new Book();
        // Ask user for the number of books to add
        System.out.print("Enter the number of books to add: ");
        int numBooks = sc.nextInt();

        // Create an array to store Book objects
        Book[] books = new Book[numBooks];
      
        // Add books to the array using constructors
        for (int i = 0; i < numBooks; i++) {
            sc.nextLine(); // Consume newline
            System.out.println("\nEnter details for Book " + (i + 1) + ":");
            System.out.print("Title: ");
            String title = sc.nextLine();
            System.out.print("Author: ");
            String author = sc.nextLine();
            System.out.print("Page Count: ");
            int pageCount = sc.nextInt();
            books[i] = new Book();
            books[i].setTitle(title);
            books[i].setAuthor(author);
            books[i].setPageCount(pageCount);
        }

        // Display all the books added
        System.out.println("\nBooks added:");
        for (int i = 0; i < numBooks; i++) {
            System.out.println("Book " + (i + 1) + ":");
            System.out.println("Title: " + books[i].getTitle());
            System.out.println("Author: " + books[i].getAuthor());
            System.out.println("Page Count: " + books[i].getPageCount());
            System.out.println();
        }

        
    }
}