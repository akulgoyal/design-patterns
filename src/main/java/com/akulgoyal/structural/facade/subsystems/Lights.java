package com.akulgoyal.structural.facade.subsystems;

public class Lights {

    public void dim(int intensity) {
        System.out.println("Dimming lights to: " + intensity + " intensity");
    }

    public void on() {
        System.out.println("Lights on at full intensity");
    }

    public void off() {
        System.out.println("Lights off");
    }
}
