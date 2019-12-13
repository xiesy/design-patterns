package com.example.demo.bigtalkdesignpatterns.simplefactory;

public class CashNormal implements CashSuper {
    @Override
    public double acceptCash(double money) {
        return money;
    }
}
