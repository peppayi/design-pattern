package com.peppayi.designpattern.headfirst.chapters.chapter03.condiment;

import com.peppayi.designpattern.headfirst.chapters.chapter03.CondimentDecorator;
import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.Beverage;

public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

    @Override
    public double cost() {
        return 0.10 + beverage.cost();
    }
}
