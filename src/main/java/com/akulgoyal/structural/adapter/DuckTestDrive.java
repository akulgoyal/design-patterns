package com.akulgoyal.structural.adapter;

import com.akulgoyal.structural.adapter.adaptee.WildTurkey;
import com.akulgoyal.structural.adapter.adapter.TurkeyAdapter;
import com.akulgoyal.structural.adapter.target.Duck;
import com.akulgoyal.structural.adapter.target.MallardDuck;

public class DuckTestDrive {

    public static void main(String []args) {

        MallardDuck mallardDuck = new MallardDuck();

        WildTurkey wildTurkey = new WildTurkey();
        Duck turkeyBecomesDuck = new TurkeyAdapter(wildTurkey);

        System.out.println("The turkey says...");
        wildTurkey.gobble();
        wildTurkey.fly();

        System.out.println("\nThe Duck says...");
        testDuck(mallardDuck);

        System.out.println("\nThe turkey turned to duck says...");
        testDuck(turkeyBecomesDuck);
    }

    private static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}
