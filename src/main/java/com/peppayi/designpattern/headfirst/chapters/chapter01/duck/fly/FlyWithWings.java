package com.peppayi.designpattern.headfirst.chapters.chapter01.duck.fly;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class FlyWithWings implements FlyBehavior {

    @Override
    public void fly() {
        log.info("展翅高飞");
    }
}
