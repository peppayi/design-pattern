package com.peppayi.designpattern.headfirst.chapters.chapter06.command;

import com.peppayi.designpattern.headfirst.chapters.chapter06.Command;

public class NoCommand implements Command  {

    @Override
    public void execute() {
    }

    @Override
    public void undo() {
    }
}
