package com.akulgoyal.strategy.behaviours;

public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
