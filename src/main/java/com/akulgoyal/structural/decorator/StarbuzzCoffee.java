package com.akulgoyal.structural.decorator;

import com.akulgoyal.structural.decorator.component.Beverage;
import com.akulgoyal.structural.decorator.component.DarkRoast;
import com.akulgoyal.structural.decorator.component.Espresso;
import com.akulgoyal.structural.decorator.component.HouseBlend;
import com.akulgoyal.structural.decorator.decorators.Mocha;
import com.akulgoyal.structural.decorator.decorators.Soy;
import com.akulgoyal.structural.decorator.decorators.Whip;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class StarbuzzCoffee {

    public static void main(String []args) {

        Beverage espresso = new Espresso();
        System.out.println(espresso.getDescription() + " costs $" + round(espresso.cost()));

        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Whip(darkRoast);
        System.out.println(darkRoast.getDescription() + " costs $" + round(darkRoast.cost()));

        Beverage houseBlend = new HouseBlend();
        houseBlend = new Mocha(houseBlend);
        houseBlend = new Soy(houseBlend);
        houseBlend = new Whip(houseBlend);
        System.out.println(houseBlend.getDescription() + " costs $" + round(houseBlend.cost()));
    }

    private static double round(double value) {
        BigDecimal bd = new BigDecimal(value);
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }
}
