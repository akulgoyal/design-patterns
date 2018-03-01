package com.akulgoyal.strategy;

import com.akulgoyal.strategy.behaviours.*;
import com.akulgoyal.strategy.clients.Duck;
import com.akulgoyal.strategy.clients.MallardDuck;
import com.akulgoyal.strategy.clients.RubberDuck;
import com.akulgoyal.strategy.clients.WoodenDuck;

public class DuckSimulator {

    public static void main(String args[]) {

        Duck mallardDuck = new MallardDuck(new FlyWithWings(), new Quack());
        demoDuck(mallardDuck);

        Duck rubberDuck = new RubberDuck(new FlyNoWay(), new Squeak());
        demoDuck(rubberDuck);

        Duck woodenDuck = new WoodenDuck(new FlyNoWay(), new MuteQuack());
        demoDuck(woodenDuck);
    }

    private static void demoDuck(Duck duck) {
        System.out.println();
        duck.display();
        duck.performFly();
        duck.performQuack();
        duck.swim();
    }
}
