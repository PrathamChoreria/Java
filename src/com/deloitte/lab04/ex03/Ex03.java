package com.deloitte.lab04.ex03;

public class Ex03 {
	public static void main(String[] args) {
        Book book = new Book("B-1", "Java Programming", 3, "John Doe");
        JournalPaper journal = new JournalPaper("J-1", "AI Advances", 2, "John Doe", 2020);
        Video video = new Video("V-1", "Inception", 4, 148, "Christopher Nolan", "Sci-Fi", 2010);
        CD cd = new CD("C-1", "Top Hits", 6, 68, "Various Artists", "Pop");

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
    }
}
