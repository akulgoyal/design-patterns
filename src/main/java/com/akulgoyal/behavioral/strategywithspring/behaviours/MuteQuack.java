package com.akulgoyal.behavioral.strategywithspring.behaviours;

import org.springframework.stereotype.Component;

@Component("QUACK_MUTE")
public class MuteQuack implements QuackBehaviour {

    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
