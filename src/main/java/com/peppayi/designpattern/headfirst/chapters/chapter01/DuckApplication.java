package com.peppayi.designpattern.headfirst.chapters.chapter01;

import com.peppayi.designpattern.headfirst.chapters.chapter01.fly.FlyRocketPowered;

public class DuckApplication {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();
    }
}
