package com.example.demo.bigtalkdesignpatterns.proxypatterns;

/**
 * 代理类
 * @author xsy
 */
public class Proxy implements GiveGift {

    Pursuit pursuit;

    public Proxy(SchoolGirl schoolGirl){
        pursuit = new Pursuit(schoolGirl);
    }

    @Override
    public void giveDolls() {
        pursuit.giveDolls();
    }

    @Override
    public void giveFlowers() {
        pursuit.giveFlowers();
    }

    @Override
    public void giveChocolate() {
        pursuit.giveChocolate();
    }
}
