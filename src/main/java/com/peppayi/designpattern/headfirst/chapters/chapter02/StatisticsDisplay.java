package com.peppayi.designpattern.headfirst.chapters.chapter02;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StatisticsDisplay implements Observer, DisplayElement {

    private double minTemperature;

    private double maxTemperature;

    private double avgTemperature;

    private int sampleCount;

    private double sumTemperature;

    private Subject weatherData;

    public StatisticsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        this.weatherData.registerObserver(this);
        this.minTemperature = Integer.MAX_VALUE;
        this.maxTemperature = Integer.MIN_VALUE;
    }

    @Override
    public void update(double temperature, double humidity, double pressure) {
        this.minTemperature = Math.min(this.minTemperature, temperature);
        this.maxTemperature = Math.max(this.maxTemperature, temperature);
        this.sumTemperature += temperature;
        this.sampleCount++;
        this.avgTemperature = this.sumTemperature / this.sampleCount;

        this.display();
    }

    @Override
    public void display() {
        log.info("Avg/Max/Min temperature = {}/{}/{}", this.avgTemperature, this.maxTemperature, this.minTemperature);
    }
}
