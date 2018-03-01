package com.akulgoyal.state.context;

import com.akulgoyal.state.states.*;

public class GumballMachine {

    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State currentState;
    private int count;

    public GumballMachine(int numberOfGumballs) {

        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        soldOutState = new SoldOutState(this);
        winnerState = new WinnerState(this);
        this.count = numberOfGumballs;
        if(numberOfGumballs > 0) {
            currentState = noQuarterState;
        } else {
            currentState = soldOutState;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }

    public void setCurrentState(State currentState) {
        this.currentState = currentState;
    }

    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if(count != 0) {
            count--;
        }
    }

    public void inserQuarter() {
        currentState.insertQuarter();
    }

    public void ejectQuarter() {
        currentState.ejectQuarter();
    }

    public void turnCrank() {
        currentState.turnCrank();
    }

    public void dispense() {
        currentState.dispense();
    }

    @Override
    public String toString() {
        return "currentState=" + currentState;
    }
}
