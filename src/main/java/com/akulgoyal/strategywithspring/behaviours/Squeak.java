package com.akulgoyal.strategywithspring.behaviours;

import org.springframework.stereotype.Component;

@Component("QUACK_SQUEAK")
public class Squeak implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Squeak!");
    }
}
