package com.deloitte.lab04.ex03;

public class Video extends MediaItem {
	private String director;
    private String genre;
    private int yearReleased;

    public Video(String id, String title, int numberOfCopies, int runtime, String director, String genre, int yearReleased) {
        super(id, title, numberOfCopies, runtime);
        this.director = director;
        this.genre = genre;
        this.yearReleased = yearReleased;
    }

    @Override
    public String toString() {
        return super.toString() + ", Director: " + director + ", Genre: " + genre + ", Year Released: " + yearReleased;
    }

    @Override
    public void printDetails() {
        System.out.println("Video Details: " + this.toString());
    }
}