package com.akulgoyal.strategy.clients;

import com.akulgoyal.strategy.behaviours.FlyBehaviour;
import com.akulgoyal.strategy.behaviours.QuackBehaviour;

public class MallardDuck extends Duck {

    public MallardDuck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        super(flyBehaviour, quackBehaviour);
    }

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }
}
