package com.akulgoyal.factorymethod.products;

public class ChicagoStyleVegPizza extends Pizza {

    public ChicagoStyleVegPizza() {
        name = "Chicago style cheeze pizza";
        dough = "PAN crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella cheese");
        toppings.add("Common vegies");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
