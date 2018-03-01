package com.akulgoyal.behavioral.commandpattern;

import com.akulgoyal.behavioral.commandpattern.commands.*;
import com.akulgoyal.behavioral.commandpattern.invoker.RemoteControl;
import com.akulgoyal.behavioral.commandpattern.receiver.Car;
import com.akulgoyal.behavioral.commandpattern.receiver.RotatingTop;

public class Client {

    public static void main(String []args) {

        RemoteControl remoteControl = new RemoteControl();

        System.out.println("\n-----Testing onButtonPressed on RemoteControl for Car-----");
        Car car=new Car();
        Command carMoveCommand = new CarMoveCommand(car);
        remoteControl.onButton(carMoveCommand);

        System.out.println("\n-----Testing offButtonPressed on RemoteControl for Car-----");
        Command carStopCommand = new CarStopCommand(car);
        remoteControl.offButton(carStopCommand);

        System.out.println("\n-----Testing undoButtonPressed() on RemoteControl for Car-----");
        remoteControl.undoButton();

        System.out.println("\n-----Testing onButtonPressed on RemoteControl for RotatingTop-----");
        RotatingTop top = new RotatingTop();
        Command topRotateCommand = new TopRotateCommand(top);
        remoteControl.onButton(topRotateCommand);

        System.out.println("\n-----Testing offButtonPressed on RemoteControl for RotatingTop-----");
        Command topStopRotateCommand = new TopStopCommand(top);
        remoteControl.offButton(topStopRotateCommand);

        System.out.println("\n-----Testing undoButtonPressed on RemoteControl for RotatingTop-----");
        remoteControl.undoButton();
    }
}
