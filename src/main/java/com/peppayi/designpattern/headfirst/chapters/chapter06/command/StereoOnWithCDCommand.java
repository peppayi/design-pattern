package com.peppayi.designpattern.headfirst.chapters.chapter06.command;

import com.peppayi.designpattern.headfirst.chapters.chapter06.Command;
import com.peppayi.designpattern.headfirst.chapters.chapter06.vendor.Stereo;

public class StereoOnWithCDCommand implements Command {

    private Stereo stereo;

    public StereoOnWithCDCommand(Stereo stereo) {
        this.stereo = stereo;
    }


    @Override
    public void execute() {
        this.stereo.on();
        this.stereo.setCd();
        this.stereo.setVolumn(11);
    }

    @Override
    public void undo() {
        // TODO
    }
}
