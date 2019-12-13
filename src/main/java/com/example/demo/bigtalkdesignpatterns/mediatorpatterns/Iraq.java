package com.example.demo.bigtalkdesignpatterns.mediatorpatterns;


public class Iraq extends Country {

    public Iraq(UnitedNations unitedNations) {
        super(unitedNations);
    }

    public void declare(String message){
        unitedNations.declare(message, this);
    }

    public void getMessage(String message){
        System.out.println("伊拉克获得对方信息:" + message);
    }

}
