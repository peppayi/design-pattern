package com.peppayi.designpattern.headfirst.chapters.chapter06.command;

import com.peppayi.designpattern.headfirst.chapters.chapter06.Command;
import com.peppayi.designpattern.headfirst.chapters.chapter06.vendor.GarageDoor;

public class GarageDoorOpenCommand implements Command {

    private GarageDoor garageDoor;

    public GarageDoorOpenCommand(GarageDoor garageDoor) {
        this.garageDoor = garageDoor;
    }

    @Override
    public void execute() {
        garageDoor.up();
    }
}
