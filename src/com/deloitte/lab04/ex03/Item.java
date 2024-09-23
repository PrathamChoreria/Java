package com.deloitte.lab04.ex03;

public abstract class Item {
	private String id;
    private String title;
    private int numberOfCopies;

    public Item(String id, String title, int numberOfCopies) {
        this.id = id;
        this.title = title;
        this.numberOfCopies = numberOfCopies;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getNumberOfCopies() {
        return numberOfCopies;
    }

    public void setNumberOfCopies(int numberOfCopies) {
        this.numberOfCopies = numberOfCopies;
    }

    public boolean checkOut() {
        if (numberOfCopies > 0) {
            numberOfCopies--;
            return true;
        }
        return false;
    }

    public void checkIn() {
        numberOfCopies++;
    }

    @Override
    public String toString() {
        return "Item ID: " + id + ", Title: " + title + ", Copies: " + numberOfCopies;
    }

    public abstract void printDetails();
}


