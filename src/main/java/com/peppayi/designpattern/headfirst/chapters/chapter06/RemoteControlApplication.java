package com.peppayi.designpattern.headfirst.chapters.chapter06;

import com.peppayi.designpattern.headfirst.chapters.chapter06.command.GarageDoorOpenCommand;
import com.peppayi.designpattern.headfirst.chapters.chapter06.command.LightOnCommand;
import com.peppayi.designpattern.headfirst.chapters.chapter06.vendor.GarageDoor;
import com.peppayi.designpattern.headfirst.chapters.chapter06.vendor.Light;

public class RemoteControlApplication {

    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();

        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);

        remote.setCommand(lightOn);
        remote.buttonPressed();

        GarageDoor garageDoor = new GarageDoor();
        GarageDoorOpenCommand garageOpen = new GarageDoorOpenCommand(garageDoor);
        remote.setCommand(garageOpen);
        remote.buttonPressed();
    }
}
