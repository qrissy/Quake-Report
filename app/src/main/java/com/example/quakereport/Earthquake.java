package com.example.quakereport;

public class Earthquake {

    // The earthquake mag
    private String magnitude;

    // The name of the city
    private String location;

    // Drawable resource ID
    private String date;

    public Earthquake(String magnitude, String location, String date) {
        this.magnitude = magnitude;
        this.location = location;
        this.date = date;
    }

    public String getMagnitude() {
        return magnitude;
    }

    public String getLocation() {
        return location;
    }

    public String getDate() {
        return date;
    }
}
