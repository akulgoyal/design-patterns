package com.akulgoyal.facade.subsystems;

public class Dvd {

    private String movieName = "Wolf of wallstreet";

    public Dvd() {
    }

    public Dvd(String movieName) {
        this.movieName = movieName;
    }

    public String getMovieName() {
        return movieName;
    }
}
