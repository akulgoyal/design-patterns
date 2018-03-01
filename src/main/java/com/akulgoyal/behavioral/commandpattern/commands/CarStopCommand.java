package com.akulgoyal.behavioral.commandpattern.commands;

import com.akulgoyal.behavioral.commandpattern.receiver.Car;

public class CarStopCommand implements Command {

    private Car car;

    public CarStopCommand(Car car) {
        this.car = car;
    }

    @Override
    public void execute() {
        System.out.println("CarStopCommand.execute(): Invoking stop() on Car");
        car.stop();
    }

    @Override
    public void undo() {
        System.out.println("CarStopCommand.undo(): Undoing previous action-> Invoking move() on Car");;
        car.move();
    }
}
