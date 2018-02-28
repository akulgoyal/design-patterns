package com.akulgoyal.factorymethod.products;

public class ChicagoStyleCheesePizza extends Pizza {

    public ChicagoStyleCheesePizza() {
        name = "Chicago style cheeze pizza";
        dough = "PAN crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella cheese");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}