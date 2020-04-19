package com.peppayi.designpattern.headfirst.chapters.chapter02;

public class WeatherStationApplication {

    public static void main(String[] args) {
        WeatherData wd = new WeatherData();

        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay(wd);
        StatisticsDisplay sd = new StatisticsDisplay(wd);

        wd.setMeasurements(80, 60, 30.4);
        wd.setMeasurements(82, 70, 29.2);
    }
}
