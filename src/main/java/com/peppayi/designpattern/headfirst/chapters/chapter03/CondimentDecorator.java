package com.peppayi.designpattern.headfirst.chapters.chapter03;

import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.Beverage;

public abstract class CondimentDecorator extends Beverage {

    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public abstract String getDescription();
}
