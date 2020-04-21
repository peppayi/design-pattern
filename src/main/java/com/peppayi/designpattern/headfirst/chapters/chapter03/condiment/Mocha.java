package com.peppayi.designpattern.headfirst.chapters.chapter03.condiment;

import com.peppayi.designpattern.headfirst.chapters.chapter03.CondimentDecorator;
import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.Beverage;

public class Mocha extends CondimentDecorator {

    public Mocha(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Mocha";
    }

    @Override
    public double cost() {
        return 0.20 + beverage.cost();
    }
}
