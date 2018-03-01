package com.akulgoyal.structural.facade;

import com.akulgoyal.structural.facade.facade.HomeTheatre;
import com.akulgoyal.structural.facade.subsystems.Lights;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        Lights lights = new Lights();
        lights.on();
        System.out.println("\n");

        HomeTheatre homeTheatre = new HomeTheatre();
        homeTheatre.watchMovie("Kill Bill");
        homeTheatre.endMovie();

        System.out.println("\n");
        lights.off();
    }
}
