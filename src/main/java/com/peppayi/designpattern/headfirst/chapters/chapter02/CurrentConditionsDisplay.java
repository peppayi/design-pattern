package com.peppayi.designpattern.headfirst.chapters.chapter02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private double temperature;

    private double humidity;

    // reference to Subject for further use
    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.temperature = temperature;
        this.humidity = humidity;

        // TODO: It's not a good place to call @{code display()}
        this.display();
    }

    @Override
    public void display() {
        log.info("Current conditions: {} F degrees and {}% humidity", temperature, humidity);
    }
}
