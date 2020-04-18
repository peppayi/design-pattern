package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoyDuck extends Duck {

    @Override
    public void quack() {
        // DO NOTHING
    }

    @Override
    public void fly() {
        // DO NOTHING
    }

    @Override
    public void display() {
        log.info("木鸭子");
    }
}
