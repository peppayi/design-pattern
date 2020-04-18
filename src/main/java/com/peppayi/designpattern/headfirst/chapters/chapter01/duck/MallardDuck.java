package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck implements Flyable, Quackable {

    @Override
    public void display() {
        log.info("绿油油的野鸭");
    }

    @Override
    public void fly() {
        log.info("野鸭在飞");
    }

    @Override
    public void quack() {
        log.info("野鸭嘎嘎嘎");
    }
}
