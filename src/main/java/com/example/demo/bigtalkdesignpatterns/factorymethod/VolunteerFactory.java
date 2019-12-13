package com.example.demo.bigtalkdesignpatterns.factorymethod;

public class VolunteerFactory implements IFactory {

    @Override
    public LeiFeng createLeiFeng() {
        return new Volunteer();
    }
}
