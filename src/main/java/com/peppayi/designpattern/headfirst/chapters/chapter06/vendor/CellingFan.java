package com.peppayi.designpattern.headfirst.chapters.chapter06.vendor;

public class CellingFan {

    public static final int HIGH = 3;

    public static final int MEDIUM = 2;

    public static final int LOW = 1;

    public static final int OFF = 0;

    String location;
    int speed;

    public CellingFan(String location) {
        this.location = location;
        this.speed = OFF;
    }

    public void high() {
        this.speed = HIGH;
        // code to set fan to high
    }

    public void medium() {
        this.speed = MEDIUM;
        // code to set fan to medium
    }

    public void low() {
        this.speed = LOW;
        // code to set fan to low
    }

    public void off() {
        this.speed = OFF;
        // code to turn fan off
    }

    public int getSpeed() {
        return this.speed;
    }
}
