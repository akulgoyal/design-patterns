package com.akulgoyal.creational.factorymethod.products;

public class ChicagoStyleChickenPizza extends Pizza {

    public ChicagoStyleChickenPizza() {
        name = "Chicago style cheeze pizza";
        dough = "PAN crust dough";
        sauce = "Plum tomato sauce";

        toppings.add("Shredded Mozzarella cheese");
        toppings.add("Chicken sausages");
    }

    public void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
