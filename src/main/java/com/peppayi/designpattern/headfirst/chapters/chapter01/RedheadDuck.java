package com.peppayi.designpattern.headfirst.chapters.chapter01;

import com.peppayi.designpattern.headfirst.chapters.chapter01.fly.FlyWithWings;
import com.peppayi.designpattern.headfirst.chapters.chapter01.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RedheadDuck extends Duck {

    public RedheadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        log.info("红头鸭子");
    }
}
