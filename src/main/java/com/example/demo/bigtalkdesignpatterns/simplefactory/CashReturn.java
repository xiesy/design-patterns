package com.example.demo.bigtalkdesignpatterns.simplefactory;

public class CashReturn implements CashSuper {

    private double moneyCondition;
    private double moneyReturn;
    public CashReturn(String moneyCondition, String moneyReturn){
        this.moneyCondition = Double.parseDouble(moneyCondition);
        this.moneyReturn = Double.parseDouble(moneyReturn);
    }

    @Override
    public double acceptCash(double money) {
        double result = money;
        if (money >= moneyCondition){
            result = money - Math.floor(money / moneyCondition) * moneyReturn;
        }
        return result;
    }
}
