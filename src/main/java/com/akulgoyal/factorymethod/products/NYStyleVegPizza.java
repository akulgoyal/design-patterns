package com.akulgoyal.factorymethod.products;

public class NYStyleVegPizza extends Pizza {

    public NYStyleVegPizza() {
        name = "NY style chicken pizza";
        dough = "Thin crust dough";
        sauce = "Marinara sauce";

        toppings.add("Grated Reggiano Cheeze");
        toppings.add("Common vegies");
        toppings.add("Exotic herbs");
    }
}
