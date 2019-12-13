package com.example.demo.bigtalkdesignpatterns.proxypatterns;

/**
 * 代理模式
 */
public class Test {

    public static void main(String[] args){
        SchoolGirl schoolGirl = new SchoolGirl();
        schoolGirl.setName("娇娇");
        Proxy proxy = new Proxy(schoolGirl);
        proxy.giveChocolate();
        proxy.giveDolls();
        proxy.giveFlowers();
    }

}
