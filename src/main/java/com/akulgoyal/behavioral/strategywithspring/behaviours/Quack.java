package com.akulgoyal.behavioral.strategywithspring.behaviours;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("QUACK_QUACK")
@Primary
public class Quack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("Quack quack!");
    }
}
