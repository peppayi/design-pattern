package com.peppayi.designpattern.headfirst.chapters.chapter03;

import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.Beverage;
import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.DarkRoast;
import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.Espresso;
import com.peppayi.designpattern.headfirst.chapters.chapter03.beverage.HouseBlend;
import com.peppayi.designpattern.headfirst.chapters.chapter03.condiment.Mocha;
import com.peppayi.designpattern.headfirst.chapters.chapter03.condiment.Soy;
import com.peppayi.designpattern.headfirst.chapters.chapter03.condiment.Whip;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StarbuzzCoffeeApplication {

    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        log.info(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        log.info(beverage2.getDescription() + " $" + beverage2.cost());

        Beverage beverage3 = new HouseBlend();
        beverage3 = new Soy(beverage3);
        beverage3 = new Mocha(beverage3);
        beverage3 = new Whip(beverage3);
        log.info(beverage3.getDescription() + " $" + beverage3.cost());
    }
}
