package com.peppayi.designpattern.headfirst.chapters.chapter06;

import com.peppayi.designpattern.headfirst.chapters.chapter06.vendor.Light;

public class LightOnCommand implements Command {

    Light light;

    public LightOnCommand(Light light) {
        this.light = light;
    }

    @Override
    public void execute() {
        light.on();
    }
}
