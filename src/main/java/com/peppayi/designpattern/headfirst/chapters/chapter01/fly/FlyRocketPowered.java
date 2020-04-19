package com.peppayi.designpattern.headfirst.chapters.chapter01.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyRocketPowered implements FlyBehavior {

    @Override
    public void fly() {
        log.info("乘火箭飞");
    }
}
