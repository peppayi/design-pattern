package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedheadDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        log.info("红头鸭子");
    }

    @Override
    public void fly() {
        log.info("红头鸭子飞啦");
    }

    @Override
    public void quack() {
        log.info("红头鸭子嘎嘎嘎");
    }
}
