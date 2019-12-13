package com.example.demo.bigtalkdesignpatterns.adapterpatterns;

public class Adapter extends Target {

    private Adaptee adaptee = new Adaptee();

    @Override
    public void request(){
        adaptee.specificRequest();
    }


}
