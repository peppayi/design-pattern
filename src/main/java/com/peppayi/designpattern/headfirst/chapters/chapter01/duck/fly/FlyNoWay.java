package com.peppayi.designpattern.headfirst.chapters.chapter01.duck.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        log.info("飞不动了");
    }
}
