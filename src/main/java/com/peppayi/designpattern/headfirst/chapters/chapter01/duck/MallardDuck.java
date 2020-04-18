package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import com.peppayi.designpattern.headfirst.chapters.chapter01.duck.fly.FlyWithWings;
import com.peppayi.designpattern.headfirst.chapters.chapter01.duck.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        log.info("绿油油的野鸭");
    }
}
