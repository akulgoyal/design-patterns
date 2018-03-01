package com.akulgoyal.structural.facade.facade;

import com.akulgoyal.structural.facade.subsystems.*;

public class HomeTheatre {

    Dvd dvd;
    Amplifier amplifier;
    DvdPlayer dvdPlayer;
    Lights lights;
    PopcornPopper popcornPopper;
    Projector projector;
    Screen screen;

    public HomeTheatre() {
        this.dvd = null;
        this.dvdPlayer = null;
        this.amplifier = new Amplifier();
        this.lights = new Lights();
        this.popcornPopper = new PopcornPopper();
        this.projector = new Projector();
        this.screen = new Screen();
    }

    public void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");

        dvd = new Dvd(movie);
        dvdPlayer = new DvdPlayer(dvd);

        popcornPopper.on();
        popcornPopper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.widescreen();
        amplifier.on();
        amplifier.setDvd(dvd);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play();
    }

    public void endMovie() {
        System.out.println("\nShutting movie theatre down...");
        popcornPopper.off();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
