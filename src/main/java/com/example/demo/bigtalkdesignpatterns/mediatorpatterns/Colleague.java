package com.example.demo.bigtalkdesignpatterns.mediatorpatterns;

public abstract class Colleague {

    protected Mediator mediator;

    public Colleague(Mediator mediator){
        this.mediator = mediator;
    }

}
