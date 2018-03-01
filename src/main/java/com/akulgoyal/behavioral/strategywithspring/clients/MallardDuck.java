package com.akulgoyal.behavioral.strategywithspring.clients;

import org.springframework.stereotype.Component;

@Component
public class MallardDuck extends Duck {

    @Override
    public void display() {
        System.out.println("I'm mallard duck");
    }
}
