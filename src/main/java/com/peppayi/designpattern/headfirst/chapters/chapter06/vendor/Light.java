package com.peppayi.designpattern.headfirst.chapters.chapter06.vendor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Light {

    public void on() {
        log.info("开灯");
    }

    public void off() {
        log.info("关灯");
    }
}
