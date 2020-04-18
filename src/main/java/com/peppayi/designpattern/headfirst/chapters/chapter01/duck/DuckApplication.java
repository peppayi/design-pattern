package com.peppayi.designpattern.headfirst.chapters.chapter01.duck;

public class DuckApplication {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();
    }
}
