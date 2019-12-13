package com.example.demo.bigtalkdesignpatterns.mediatorpatterns;


public class Usa extends Country {

    public Usa(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message){
        unitedNations.declare(message, this);
    }

    public void getMessage(String message){
        System.out.println("美国获得对方信息:" + message);
    }

}
