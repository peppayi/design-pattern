package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import com.peppayi.designpattern.headfirst.chapters.chapter01.duck.fly.FlyNoWay;
import com.peppayi.designpattern.headfirst.chapters.chapter01.duck.quack.Squeak;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RubberDuck extends Duck {

    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Squeak();
    }

    @Override
    public void display() {
        log.info("橡胶鸭子");
    }
}
