package com.akulgoyal.creational.factorymethod.products;

public class NYStyleChickenPizza extends Pizza {

    public NYStyleChickenPizza() {
        name = "NY style chicken pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheeze");
        toppings.add("Barbeque chicken");
    }
}
