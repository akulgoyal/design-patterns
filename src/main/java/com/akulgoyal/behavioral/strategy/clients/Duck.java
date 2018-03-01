package com.akulgoyal.behavioral.strategy.clients;

import com.akulgoyal.behavioral.strategy.behaviours.FlyBehaviour;
import com.akulgoyal.behavioral.strategy.behaviours.QuackBehaviour;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected  QuackBehaviour quackBehaviour;

    public Duck(FlyBehaviour flyBehaviour, QuackBehaviour quackBehaviour) {
        this.flyBehaviour = flyBehaviour;
        this.quackBehaviour = quackBehaviour;
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaviour.quack();
    }

    public void swim() {
        System.out.println("All ducks float...");
    }

    public abstract void display();
}
