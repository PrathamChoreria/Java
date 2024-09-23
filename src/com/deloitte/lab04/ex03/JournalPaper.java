package com.deloitte.lab04.ex03;

public class JournalPaper extends WrittenItem {
	private int yearPublished;

    public JournalPaper(String id, String title, int numberOfCopies, String author, int yearPublished) {
        super(id, title, numberOfCopies, author);
        this.yearPublished = yearPublished;
    }

    @Override
    public String toString() {
        return super.toString() + ", Year Published: " + yearPublished;
    }

    @Override
    public void printDetails() {
        System.out.println("Journal Paper Details: " + this.toString());
    }
}