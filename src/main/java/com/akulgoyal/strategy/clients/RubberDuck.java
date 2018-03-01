package com.akulgoyal.strategy.clients;

import com.akulgoyal.strategy.behaviours.FlyBehaviour;
import com.akulgoyal.strategy.behaviours.QuackBehaviour;

public class RubberDuck extends Duck {

    public RubberDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm a rubber duck");
    }
}
