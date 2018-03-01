package com.akulgoyal.behavioral.strategy.behaviours;

public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
