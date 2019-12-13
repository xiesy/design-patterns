package com.example.demo.bigtalkdesignpatterns.decorationpatterns;

public class Tshirts extends Finery{
    @Override
    public void show(){
        System.out.println("大T恤");
        super.show();
    }
}
