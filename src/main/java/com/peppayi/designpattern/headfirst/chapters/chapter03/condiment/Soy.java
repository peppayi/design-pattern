package com.peppayi.designpattern.headfirst.chapters.chapter03.condiment;

import com.peppayi.designpattern.headfirst.chapters.chapter03.CondimentDecorator;
import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.Beverage;

public class Soy extends CondimentDecorator {

    public Soy(Beverage beverage) {
        super(beverage);
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    @Override
    public double cost() {
        return 0.15 + beverage.cost();
    }
}
