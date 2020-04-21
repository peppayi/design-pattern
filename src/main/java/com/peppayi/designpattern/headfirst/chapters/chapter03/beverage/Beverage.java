package com.peppayi.designpattern.headfirst.chapters.chapter03.beverage;

public abstract class Beverage {

    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
