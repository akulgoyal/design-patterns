package com.akulgoyal.templatemethod;

public abstract class CaffeineBeverage {

    public final void prepareRecipe() {

        boilWater();
        brew();
        pourInCup();
        if(customerWantsCondiments()) {
            addCondiments();
        }
    }

    protected abstract void addCondiments();

    protected abstract void brew();

    private void pourInCup() {
        System.out.println("Pouring into cup");
    }

    private void boilWater() {
        System.out.println("Boiling water...");
    }

    /**
     * This is called a hook
     */
    protected boolean customerWantsCondiments() {
        return true;
    }
}
