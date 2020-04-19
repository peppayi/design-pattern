package com.peppayi.designpattern.headfirst.chapters.chapter02;

public interface Subject {

    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
