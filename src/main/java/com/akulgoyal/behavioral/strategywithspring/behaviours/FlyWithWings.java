package com.akulgoyal.behavioral.strategywithspring.behaviours;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("FLY_WITH_WINGS")
@Primary
public class FlyWithWings implements FlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I'm flying!");
    }
}
