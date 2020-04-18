package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import com.peppayi.designpattern.headfirst.chapters.chapter01.duck.fly.FlyBehavior;
import com.peppayi.designpattern.headfirst.chapters.chapter01.duck.quack.QuackBehavior;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Duck {

    protected FlyBehavior flyBehavior;

    protected QuackBehavior quackBehavior;

    public void swim() {
        log.info("游泳");
    }

    public abstract void display();

    public void performFly() {
        this.flyBehavior.fly();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }
}
