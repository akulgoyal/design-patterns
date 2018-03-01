package com.akulgoyal.strategy.behaviours;

public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
