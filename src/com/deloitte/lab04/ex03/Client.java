package com.deloitte.lab04.ex03;

public class Client {

    public static void main(String[] args) {
        // Create instances of items
        Book book = new Book("B001", "Redbull", 5, "Vettel");
        JournalPaper journal = new JournalPaper("J001", "Ferrari", 3, "Enzo", 1945);
        Video video = new Video("V001", "The Java Adventure", 2, 120, "Alice Johnson", "Action", 2024);
        CD cd = new CD("C001", "Classical Hits", 4, 60, "Beethoven", "Classical");
        book.printDetails();
        journal.printDetails();
        video.printDetails();
        cd.printDetails();

        // Demonstrating check-out and check-in
        System.out.println("\nChecking out a book...");
        book.checkOut();
        System.out.println("Updated " + book.getTitle() + " copies: " + book.getNumberOfCopies());

        System.out.println("Checking in the book...");
        book.checkIn();
        System.out.println("Updated " + book.getTitle() + " copies: " + book.getNumberOfCopies());
        //Abstract Class Item:Defines common attributes and methods for all items.
        //Abstract Class WrittenItem:Inherits from Item and adds attributes specific to written items.
        //Classes Book and JournalPaper:Extend WrittenItem and provide specific details.

		//Abstract Class MediaItem:Inherits from Item and adds attributes specific to media items.
        //Classes Video and CD:Extend MediaItem and provide specific details.
        //Client Program:Demonstrates the creation and usage of different item types.
    }
}