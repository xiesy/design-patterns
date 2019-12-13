package com.example.demo.bigtalkdesignpatterns.observerpatterns;

public class StatisticsDisplay implements Observer {

    public StatisticsDisplay(Subject subject){
        subject.registerObserver(this);
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        System.out.println("StatisticsDisplay.update:" + temp + " " + humidity + " " + pressure);
    }
}
