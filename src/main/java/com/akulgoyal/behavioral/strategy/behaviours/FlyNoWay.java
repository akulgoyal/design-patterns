package com.akulgoyal.behavioral.strategy.behaviours;

public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
