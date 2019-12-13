package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

public class Success extends Action {
    @Override
    public void getManConclusion(Man conclusionElementA) {
        System.out.println(Man.class + conclusionElementA.action + "时，背后多半有一个伟大的女人。");
    }

    @Override
    public void getManConclusion(Woman conclusionElementB) {
        System.out.println(Woman.class + conclusionElementB.action + "时，背后多半有一个不成功的男人。");
    }
}
