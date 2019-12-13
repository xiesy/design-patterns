package com.example.demo.bigtalkdesignpatterns.simplefactory;

/**
 * 简单工厂模式
 */
public class Test {


    public static void main(String[] args){
        double total = 0;
        CashSuper cashSuper = CashFactory.createCashAccept("满300反100");
        double totalPrices = cashSuper.acceptCash(300);
        total = total + totalPrices;
        System.out.println(total);
    }
}
