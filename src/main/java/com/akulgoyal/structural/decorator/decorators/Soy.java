package com.akulgoyal.structural.decorator.decorators;

import com.akulgoyal.structural.decorator.component.Beverage;

public class Soy extends CondimentDecorator {

    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.3 + beverage.cost();
    }
}
