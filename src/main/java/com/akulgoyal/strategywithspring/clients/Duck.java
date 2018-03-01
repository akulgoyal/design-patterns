package com.akulgoyal.strategywithspring.clients;

import com.akulgoyal.strategywithspring.behaviours.FlyBehaviour;
import com.akulgoyal.strategywithspring.behaviours.QuackBehaviour;
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