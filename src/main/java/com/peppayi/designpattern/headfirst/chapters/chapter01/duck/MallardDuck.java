package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class MallardDuck extends Duck {

    @Override
    public void display() {
        log.info("绿油油的野鸭");
    }
}
