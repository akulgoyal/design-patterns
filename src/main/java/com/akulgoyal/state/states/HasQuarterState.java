package com.akulgoyal.state.states;

import com.akulgoyal.state.context.GumballMachine;

import java.util.Random;

public class HasQuarterState implements State {

    private GumballMachine gumballMachine;

    private Random randomWinner = new Random(System.currentTimeMillis());

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setCurrentState(gumballMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if(winner == 0 && gumballMachine.getCount() > 1) {
            gumballMachine.setCurrentState(gumballMachine.getWinnerState());
        } else {
            gumballMachine.setCurrentState(gumballMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("You need to first turn crank");
    }
}