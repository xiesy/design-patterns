package com.example.demo.bigtalkdesignpatterns.builderpatterns;

public abstract class Builder {
    public abstract void buildPartA();
    public abstract void buildPartB();
    public abstract Product getResult();
}
