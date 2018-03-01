package com.akulgoyal.creational.factorymethod;

import com.akulgoyal.creational.factorymethod.products.Pizza;
import com.akulgoyal.creational.factorymethod.enums.PizzaType;
import com.akulgoyal.creational.factorymethod.creators.ChicagoPizzaStore;
import com.akulgoyal.creational.factorymethod.creators.NYPizzaStore;
import com.akulgoyal.creational.factorymethod.creators.PizzaStore;

public class PizzaTestDrive {

    public static void main(String []args) {

        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza(PizzaType.CHICKEN);
        System.out.println("Ethan ordered a " + pizza.getName() + "\n");

        Pizza pizza2 = chicagoStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Joel ordered a " + pizza2.getName() + "\n");

        Pizza pizza3 = nyStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Adam ordered a " + pizza3.getName() + "\n");

        Pizza pizza4 = chicagoStore.orderPizza(PizzaType.CHEESE);
        System.out.println("Anjali ordered a " + pizza4.getName() + "\n");

        Pizza pizza5 = nyStore.orderPizza(PizzaType.VEGGIE);
        System.out.println("Chirag ordered a " + pizza5.getName() + "\n");

        Pizza pizza6 = chicagoStore.orderPizza(PizzaType.CHICKEN);
        System.out.println("Joey ordered a " + pizza6.getName() + "\n");
    }
}
