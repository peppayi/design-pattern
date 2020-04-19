package com.peppayi.designpattern.headfirst.chapters.chapter01;

import com.peppayi.designpattern.headfirst.chapters.chapter01.fly.FlyNoWay;
import com.peppayi.designpattern.headfirst.chapters.chapter01.quack.MuteQuack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class DecoyDuck extends Duck {

    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }

    @Override
    public void display() {
        log.info("木鸭子");
    }
}
