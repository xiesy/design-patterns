package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

public class Failing extends Action {
    @Override
    public void getManConclusion(Man conclusionElementA) {
        System.out.println(Man.class + conclusionElementA.action + "时，闷头喝酒，谁也不用劝。");
    }

    @Override
    public void getManConclusion(Woman conclusionElementB) {
        System.out.println(Woman.class + conclusionElementB.action + "时，眼泪汪汪，谁也劝不了。");
    }
}
