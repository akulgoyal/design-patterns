package com.akulgoyal.factorymethod.creators;

import com.akulgoyal.factorymethod.products.ChicagoStyleCheesePizza;
import com.akulgoyal.factorymethod.products.ChicagoStyleChickenPizza;
import com.akulgoyal.factorymethod.products.ChicagoStyleVegPizza;
import com.akulgoyal.factorymethod.products.Pizza;
import com.akulgoyal.factorymethod.enums.PizzaType;

import static com.akulgoyal.factorymethod.enums.PizzaType.*;

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
