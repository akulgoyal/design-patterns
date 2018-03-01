package com.akulgoyal.strategywithspring.behaviours;

import org.springframework.stereotype.Component;

@Component("FLY_NO_WAY")
public class FlyNoWay implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I can't fly!");
    }
}
