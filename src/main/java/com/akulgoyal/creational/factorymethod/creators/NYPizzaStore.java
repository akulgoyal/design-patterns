package com.akulgoyal.creational.factorymethod.creators;

import com.akulgoyal.creational.factorymethod.products.NYStyleCheesePizza;
import com.akulgoyal.creational.factorymethod.products.NYStyleChickenPizza;
import com.akulgoyal.creational.factorymethod.products.NYStyleVegPizza;
import com.akulgoyal.creational.factorymethod.products.Pizza;
import com.akulgoyal.creational.factorymethod.enums.PizzaType;

import static com.akulgoyal.creational.factorymethod.enums.PizzaType.*;

public class NYPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {

        if(type == CHEESE)
            return new NYStyleCheesePizza();
        else if(type == VEGGIE)
            return new NYStyleVegPizza();
        else if(type == CHICKEN)
            return new NYStyleChickenPizza();
        else
            return null;
    }
}
