package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class RubberDuck extends Duck {

    @Override
    public void quack() {
        log.info("橡胶鸭子吱吱叫");
    }

    @Override
    public void display() {
        log.info("橡胶鸭子");
    }
}
