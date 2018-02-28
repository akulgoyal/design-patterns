package com.akulgoyal.templatemethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Coffee extends CaffeineBeverage {

    @Override
    protected void brew() {
        System.out.println("Dripping coffee through coffee filter");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Adding sugar and milk");
    }

    public boolean customerWantsCondiments() {

        System.out.print("Would you like to add milk and sugar(y/n): ");
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

        try {
            String s = in.readLine();
            if(s.equalsIgnoreCase("y")) {
                return true;
            }
            else
                return false;

        } catch (IOException e) {
            e.printStackTrace();
        }

        return false;
    }
}