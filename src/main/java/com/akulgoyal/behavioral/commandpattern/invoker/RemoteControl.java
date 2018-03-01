package com.akulgoyal.behavioral.commandpattern.invoker;

import com.akulgoyal.behavioral.commandpattern.commands.Command;

public class RemoteControl {

    private Command onCommand;
    private Command offCommand;
    private Command undoCommand;

    public void onButton(Command onCommand) {
        this.onCommand = onCommand;
        onCommand.execute();
        undoCommand=onCommand;
    }

    public void offButton(Command offCommand) {
        this.offCommand = offCommand;
        offCommand.execute();
        undoCommand=offCommand;
    }

    public void undoButton() {
        undoCommand.undo();
    }
}
