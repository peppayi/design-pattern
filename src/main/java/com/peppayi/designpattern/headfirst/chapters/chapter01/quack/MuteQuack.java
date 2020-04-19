package com.peppayi.designpattern.headfirst.chapters.chapter01.quack;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MuteQuack implements QuackBehavior {

    @Override
    public void quack() {
        log.info("禁言了");
    }
}
