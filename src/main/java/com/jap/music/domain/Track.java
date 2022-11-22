package com.jap.music.domain;

public class Track {
    private int id;
    private String name;
    private String comments;
    private double rating;
    private String artist;

    public Track() {
    }

    public Track(int id, String name, String comments, double rating, String artist) {
        this.id = id;
        this.name = name;
        this.comments = comments;
        this.rating = rating;
        this.artist = artist;
    }
}
