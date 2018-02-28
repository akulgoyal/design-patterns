package com.akulgoyal.factorymethod.creators;

import com.akulgoyal.factorymethod.products.Pizza;
import com.akulgoyal.factorymethod.enums.PizzaType;

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
