package com.akulgoyal.structural.decorator.decorators;

import com.akulgoyal.structural.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
