package com.example.demo.bigtalkdesignpatterns.commandpatterns;

public abstract class Command {

    Barbecuer receiver;

    public Command(Barbecuer receiver){
        this.receiver = receiver;
    }

    abstract public void excuteCommand();

}
