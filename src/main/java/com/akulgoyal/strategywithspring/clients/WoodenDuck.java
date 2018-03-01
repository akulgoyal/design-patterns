package com.akulgoyal.strategywithspring.clients;

import org.springframework.stereotype.Component;

@Component
public class WoodenDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm a wooden duck");
    }
}
