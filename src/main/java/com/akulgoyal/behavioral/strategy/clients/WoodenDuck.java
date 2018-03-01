package com.akulgoyal.behavioral.strategy.clients;

import com.akulgoyal.behavioral.strategy.behaviours.FlyBehaviour;
import com.akulgoyal.behavioral.strategy.behaviours.QuackBehaviour;

public class WoodenDuck extends Duck {

    public WoodenDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm a wooden duck");
    }
}
