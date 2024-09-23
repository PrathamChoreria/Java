package com.deloitte.lab04.ex03;

public abstract class MediaItem extends Item {
    private int runtime;

    public MediaItem(String id, String title, int numberOfCopies, int runtime) {
        super(id, title, numberOfCopies);
        this.runtime = runtime;
    }

    public int getRuntime() {
        return runtime;
    }

    @Override
    public String toString() {
        return super.toString() + ", Runtime: " + runtime + " min";
    }

    @Override
    public abstract void printDetails();
}