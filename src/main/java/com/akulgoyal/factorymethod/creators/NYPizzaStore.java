package com.akulgoyal.factorymethod.creators;

import com.akulgoyal.factorymethod.products.NYStyleCheesePizza;
import com.akulgoyal.factorymethod.products.NYStyleChickenPizza;
import com.akulgoyal.factorymethod.products.NYStyleVegPizza;
import com.akulgoyal.factorymethod.products.Pizza;
import com.akulgoyal.factorymethod.enums.PizzaType;

import static com.akulgoyal.factorymethod.enums.PizzaType.*;

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
