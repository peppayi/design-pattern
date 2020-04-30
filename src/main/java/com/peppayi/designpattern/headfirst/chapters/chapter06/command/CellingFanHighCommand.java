package com.peppayi.designpattern.headfirst.chapters.chapter06.command;

import com.peppayi.designpattern.headfirst.chapters.chapter06.Command;
import com.peppayi.designpattern.headfirst.chapters.chapter06.vendor.CellingFan;

public class CellingFanHighCommand implements Command {

    private CellingFan cellingFan;

    private int prevSpeed;

    public CellingFanHighCommand(CellingFan cellingFan) {
        this.cellingFan = cellingFan;
    }

    @Override
    public void execute() {
        this.prevSpeed = cellingFan.getSpeed();
        cellingFan.high();
    }

    @Override
    public void undo() {
        if (prevSpeed == CellingFan.HIGH) {
            cellingFan.high();
        }
        else if (prevSpeed == CellingFan.MEDIUM) {
            cellingFan.medium();
        }
        else if (prevSpeed == CellingFan.LOW) {
            cellingFan.low();
        }
        else if (prevSpeed == CellingFan.OFF) {
            cellingFan.off();
        }
    }
}
