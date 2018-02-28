package com.akulgoyal.decorator.component;

public class DarkRoast extends Beverage {

    public DarkRoast() {
        description = "Dark roast";
    }

    @Override
    public double cost() {
        return 2.3;
    }
}
