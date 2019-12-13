package com.example.demo.bigtalkdesignpatterns.dutypatterns;

public abstract class Manager {

    Manager manager;

    protected String name;

    public Manager(String name){
        this.name = name;
    }

    public void setManager(Manager manager){
        this.manager = manager;
    }

    public abstract void requestApplications(Request request);

}
