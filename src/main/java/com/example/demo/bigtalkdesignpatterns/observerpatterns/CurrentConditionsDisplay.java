package com.example.demo.bigtalkdesignpatterns.observerpatterns;

public class CurrentConditionsDisplay implements Observer {

    public CurrentConditionsDisplay(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update:" + temp + " " + humidity + " " + pressure);
    }
}
