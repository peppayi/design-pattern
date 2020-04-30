package com.peppayi.designpattern.headfirst.chapters.chapter06;

import com.peppayi.designpattern.headfirst.chapters.chapter06.command.NoCommand;

import java.util.Arrays;

public class RemoteControl {

    private Command[] onCommands;
    private Command[] offCommands;

    public RemoteControl() {
        this.onCommands = new Command[7];
        this.offCommands = new Command[7];

        Command no = new NoCommand();
        for (int i = 0; i < 7; ++i) {
            this.onCommands[i] = no;
            this.offCommands[i] = no;
        }
    }

    public void setCommand(int slot, Command onCommand, Command offCommand) {
        this.onCommands[slot] = onCommand;
        this.offCommands[slot] = offCommand;
    }

    public void onButtonPressed(int slot) {
        this.onCommands[slot].execute();
    }

    public void offButtonPressed(int slot) {
        this.offCommands[slot].execute();
    }

    @Override
    public String toString() {
        return "RemoteControl{" +
                "onCommands=" + Arrays.toString(onCommands) +
                ", offCommands=" + Arrays.toString(offCommands) +
                '}';
    }
}
