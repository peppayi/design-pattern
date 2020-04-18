package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {

    public void swim() {
        log.info("游泳");
    }

    public abstract void display();
}
