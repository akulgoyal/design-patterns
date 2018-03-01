package com.akulgoyal.creational.factorymethod.creators;

import com.akulgoyal.creational.factorymethod.products.ChicagoStyleCheesePizza;
import com.akulgoyal.creational.factorymethod.products.ChicagoStyleChickenPizza;
import com.akulgoyal.creational.factorymethod.products.ChicagoStyleVegPizza;
import com.akulgoyal.creational.factorymethod.products.Pizza;
import com.akulgoyal.creational.factorymethod.enums.PizzaType;

import static com.akulgoyal.creational.factorymethod.enums.PizzaType.*;

public class ChicagoPizzaStore extends PizzaStore {

    @Override
    Pizza createPizza(PizzaType type) {

        if(type == CHEESE)
            return new ChicagoStyleCheesePizza();
        else if(type == CHICKEN)
            return new ChicagoStyleChickenPizza();
        else if(type == VEGGIE)
            return new ChicagoStyleVegPizza();
        else
            return null;
    }
}
