package com.peppayi.designpattern.headfirst.chapters.chapter06.command;

import com.peppayi.designpattern.headfirst.chapters.chapter06.Command;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NoCommand implements Command  {

    @Override
    public void execute() {
        log.info("NO COMMAND");
    }
}
