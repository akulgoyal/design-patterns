package com.akulgoyal.observer;

import com.akulgoyal.observer.observers.CurrentConditionDisplay;
import com.akulgoyal.observer.observers.ForecastDisplay;
import com.akulgoyal.observer.subject.WeatherData;

public class WeatherStation {

    public static void main(String []args) {
        WeatherData weatherData = new WeatherData();

        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
        ForecastDisplay forecastDisplay = new ForecastDisplay(weatherData);

        weatherData.setMeasurements(19, 25, 1);
        weatherData.setMeasurements(25, 50, 1.2f);
        weatherData.setMeasurements(7, 10, 1.1f);
    }
}
