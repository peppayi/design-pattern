package com.peppayi.designpattern.headfirst.chapters.chapter06.command;

import com.peppayi.designpattern.headfirst.chapters.chapter06.Command;
import com.peppayi.designpattern.headfirst.chapters.chapter06.vendor.Light;

public class LightOffCommand implements Command {

    private Light light;

    public LightOffCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        this.light.off();
    }
}
