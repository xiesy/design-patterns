package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

public class Amativeness extends Action {
    @Override
    public void getManConclusion(Man conclusionElementA) {
        System.out.println(Man.class + conclusionElementA.action + "时，凡事不懂也要装懂。");
    }

    @Override
    public void getManConclusion(Woman conclusionElementB) {
        System.out.println(Woman.class + conclusionElementB.action + "时，遇事懂也装作不懂。");
    }
}
