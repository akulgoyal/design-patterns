package com.akulgoyal.commandpattern.commands;

import com.akulgoyal.commandpattern.receiver.RotatingTop;

public class TopRotateCommand implements Command {

    private RotatingTop rotatingTop;

    public TopRotateCommand(RotatingTop rotatingTop) {
        this.rotatingTop = rotatingTop;
    }

    @Override
    public void execute() {
        System.out.println("TopRotateCommand.execute(): Invoking startRotating() on RotatingTop");
        rotatingTop.startRotating();
    }

    @Override
    public void undo() {
        System.out.println("TopRotateCommand.undo(): Undoing previous action->Invoking stopRotating() on RotatingTop");
        rotatingTop.stopRotating();
    }
}
