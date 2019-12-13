package com.example.demo.bigtalkdesignpatterns.factorymethod;

/**
 * 工厂方法模式
 */
public class Test {
    public static void main(String[] args){
        IFactory iFactory = new VolunteerFactory();
        LeiFeng leiFeng = iFactory.createLeiFeng();
        leiFeng.sweep();
        leiFeng.buyRice();
        leiFeng.wash();
    }
}
