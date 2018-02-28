package com.akulgoyal.observer.observers;

import com.akulgoyal.observer.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

public class ForecastDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float lastTemperature;
    private float currentTemperature;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
        currentTemperature = 23;
    }

    @Override
    public void update(Observable o, Object arg) {

        if(o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastTemperature = currentTemperature;
            currentTemperature = weatherData.getTemperature();
            display();
        }
    }

    @Override
    public void display() {
        if(currentTemperature<lastTemperature) {
            System.out.println("It's going to be cooler");
        }
        else{
            System.out.println("It's going to be hotter");
        }
    }
}