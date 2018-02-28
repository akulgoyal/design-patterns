package com.akulgoyal.commandpattern.commands;

import com.akulgoyal.commandpattern.receiver.Car;

public class CarMoveCommand implements Command {

    private Car car;

    public CarMoveCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("CarMoveCommand.execute(): Invoking move() on Car");
        car.move();
    }

    @Override
    public void undo() {
        System.out.println("CarMoveCommand.undo():  Undoing previous action->Invoking stop() on Car");
        car.stop();
    }
}
