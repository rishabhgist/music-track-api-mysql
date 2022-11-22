package com.jap.music.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Track {
    @Id
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }
}
