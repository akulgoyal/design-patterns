package com.akulgoyal.facade.subsystems;

public class Amplifier {

    DvdPlayer dvdPlayer;

    public void on() {
        System.out.println("Amp on");
    }

    public void off() {
        System.out.println("Amp off");
    }

    public void setDvd(Dvd dvd) {
        dvdPlayer = new DvdPlayer(dvd);
        System.out.println("Dvd inserted");
    }

    public void setSurroundSound() {
        System.out.println("Dolby ATMOS surround sound");
    }

    public void setVolume(int volume) {
        System.out.println("Volume turned to: " + volume);
    }
}
