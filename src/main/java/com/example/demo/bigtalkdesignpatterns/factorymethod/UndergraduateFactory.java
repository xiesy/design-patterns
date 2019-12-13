package com.example.demo.bigtalkdesignpatterns.factorymethod;

public class UndergraduateFactory implements IFactory{

    @Override
    public LeiFeng createLeiFeng() {
        return new Undergraduate();
    }
}
