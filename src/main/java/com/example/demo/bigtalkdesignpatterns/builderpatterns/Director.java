package com.example.demo.bigtalkdesignpatterns.builderpatterns;

public class Director {

    public void construct(Builder builder){
        builder.buildPartA();
        builder.buildPartB();
    }

}
