package com.deloitte.lab04.ex03;

public class Book extends WrittenItem {

    public Book(String id, String title, int numberOfCopies, String author) {
        super(id, title, numberOfCopies, author);
    }

    @Override
    public void printDetails() {
        System.out.println("Book Details: " + this.toString());
    }
}