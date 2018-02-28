package com.akulgoyal.decorator.decorators;

import com.akulgoyal.decorator.component.Beverage;

public abstract class CondimentDecorator extends Beverage {

    public abstract String getDescription();
}
