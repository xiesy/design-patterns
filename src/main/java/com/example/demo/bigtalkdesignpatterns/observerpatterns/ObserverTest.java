package com.example.demo.bigtalkdesignpatterns.observerpatterns;

public class ObserverTest {

    public static void main(String[] args){
        WeatherData weatherData = new WeatherData();
        CurrentConditionsDisplay currentConditionsDisplay = new CurrentConditionsDisplay(weatherData);
        StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
        weatherData.setWeatherData(0,0,0);
        weatherData.setWeatherData(1,1,1);
    }
}
