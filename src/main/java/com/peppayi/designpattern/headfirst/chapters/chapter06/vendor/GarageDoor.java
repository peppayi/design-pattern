package com.peppayi.designpattern.headfirst.chapters.chapter06.vendor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class GarageDoor {

    public void up() {
        log.info("UP");
    }

    public void down() {
        log.info("DOWN");
    }

    public void stop() {
        log.info("STOP");
    }

    public void lightOn() {
        log.info("LIGHT-ON");
    }

    public void lightOff() {
        log.info("LIGHT-OFF");
    }
}
