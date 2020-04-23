package com.peppayi.designpattern.headfirst.chapters.chapter04;

import com.peppayi.designpattern.headfirst.chapters.chapter04.pizza.CheesePizza;
import com.peppayi.designpattern.headfirst.chapters.chapter04.pizza.ClamPizza;
import com.peppayi.designpattern.headfirst.chapters.chapter04.pizza.PepperoniPizza;
import com.peppayi.designpattern.headfirst.chapters.chapter04.pizza.VeggiePizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type) {
        Pizza pizza = null;

        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        }
        else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }
        else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}
