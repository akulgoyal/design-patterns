package com.akulgoyal.creational.factorymethod.creators;

import com.akulgoyal.creational.factorymethod.products.Pizza;
import com.akulgoyal.creational.factorymethod.enums.PizzaType;

public abstract class PizzaStore {

    public Pizza orderPizza(PizzaType type) {

        Pizza pizza = createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    abstract Pizza createPizza(PizzaType type);
}
