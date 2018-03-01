package com.akulgoyal.behavioral.strategywithspring.clients;

import com.akulgoyal.behavioral.strategywithspring.behaviours.FlyBehaviour;
import com.akulgoyal.behavioral.strategywithspring.behaviours.QuackBehaviour;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class Duck {

    protected FlyBehaviour flyBehaviour;
    protected QuackBehaviour quackBehaviour;

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

    @Autowired
    public void setFlyBehaviour(FlyBehaviour flyBehaviour) {
        this.flyBehaviour = flyBehaviour;
    }

    @Autowired
    public void setQuackBehaviour(QuackBehaviour quackBehaviour) {
        this.quackBehaviour = quackBehaviour;
    }
}