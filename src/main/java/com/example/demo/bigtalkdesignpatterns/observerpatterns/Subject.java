package com.example.demo.bigtalkdesignpatterns.observerpatterns;

public interface Subject {
    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();
}
