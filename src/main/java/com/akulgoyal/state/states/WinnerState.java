package com.akulgoyal.state.states;

import com.akulgoyal.state.context.GumballMachine;

public class WinnerState implements State {

    private GumballMachine gumballMachine;

    public WinnerState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Please wait, we're already giving you a gumball");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Sorry, you already turned the crank");
    }

    @Override
    public void turnCrank() {
        System.out.println("Turning twice doesn't get you another gumball!!");
    }

    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! You get two gumballs for a quarter");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0) {
            gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
        } else {
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0) {
                gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
            } else {
                gumballMachine.setCurrentState(gumballMachine.getSoldOutState());
            }
        }
    }
}
