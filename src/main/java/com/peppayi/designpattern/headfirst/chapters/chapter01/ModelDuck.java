package com.peppayi.designpattern.headfirst.chapters.chapter01;

import com.peppayi.designpattern.headfirst.chapters.chapter01.fly.FlyNoWay;
import com.peppayi.designpattern.headfirst.chapters.chapter01.quack.Quack;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ModelDuck extends Duck {

    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    @Override
    public void display() {
        log.info("展示模型鸭子");
    }
}
