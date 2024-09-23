package com.deloitte.lab04.ex03;

public class CD extends MediaItem {
    private String artist;
    private String genre;

    // Constructor
    public CD(String id, String title, int numberOfCopies, int runtime, String artist, String genre) {
        super(id, title, numberOfCopies, runtime);
        this.artist = artist;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return super.toString() + ", Artist: " + artist + ", Genre: " + genre;
    }

    @Override
    public void printDetails() {
        System.out.println("CD Details: " + this.toString());
    }
}