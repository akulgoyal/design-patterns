package com.akulgoyal.state;

import com.akulgoyal.state.context.GumballMachine;

public class GumballMachineTestDrive {

    public static void main(String args[]) {

        GumballMachine gumballMachine = new GumballMachine(20);

        System.out.println("--------Welcome to gumball machine----------");
        System.out.println(gumballMachine);

        gumballMachine.inserQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.inserQuarter();
        gumballMachine.ejectQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine);

        gumballMachine.inserQuarter();
        gumballMachine.turnCrank();
        gumballMachine.inserQuarter();
        gumballMachine.turnCrank();
        gumballMachine.ejectQuarter();

        System.out.println(gumballMachine);

        gumballMachine.inserQuarter();
        gumballMachine.inserQuarter();
        gumballMachine.turnCrank();
        gumballMachine.inserQuarter();
        gumballMachine.turnCrank();

        System.out.println(gumballMachine + "\n\n");

        gumballMachine.dispense();

        for(int i = 0; i<20; i++) {
            gumballMachine.inserQuarter();
            gumballMachine.turnCrank();
            gumballMachine.dispense();
        }
    }
}
