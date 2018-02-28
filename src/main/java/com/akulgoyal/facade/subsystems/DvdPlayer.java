package com.akulgoyal.facade.subsystems;

public class DvdPlayer {

    Dvd dvd;

    public DvdPlayer(Dvd dvd) {
        this.dvd = dvd;
    }

    public void play() {
        System.out.println("Playing movie: " + dvd.getMovieName());
    }

    public void on() {
        System.out.println("Dvd player has been turned on");
    }

    public void off() {
        System.out.println("Dvd player is turned off");
    }

    public void stop () {
        System.out.println("Stopped movie");
    }

    public void eject() {
        System.out.println("Ejecting DVD of: " + dvd.getMovieName());
    }
}
