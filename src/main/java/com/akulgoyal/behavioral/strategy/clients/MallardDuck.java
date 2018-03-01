package com.akulgoyal.behavioral.strategy.clients;

import com.akulgoyal.behavioral.strategy.behaviours.FlyBehaviour;
import com.akulgoyal.behavioral.strategy.behaviours.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }
}
