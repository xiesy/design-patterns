package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

public abstract class Person {
    protected String action;
    public abstract void accept(Action visitor);

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public abstract void getConclusion();
}
