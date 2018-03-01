package com.akulgoyal.behavioral.commandpattern.commands;

import com.akulgoyal.behavioral.commandpattern.receiver.RotatingTop;

public class TopStopCommand implements Command {

    private RotatingTop rotatingTop;

    public TopStopCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println("TopStopRotateCommand.execute(): Invoking stopRotating() on RotatingTop");
        rotatingTop.stopRotating();    }

    @Override
    public void undo() {
        System.out.println("TopStopRotateCommand.undo(): Undoing previous action->Invoking startRotating() on RotatingTop");
        rotatingTop.startRotating();    }
}
