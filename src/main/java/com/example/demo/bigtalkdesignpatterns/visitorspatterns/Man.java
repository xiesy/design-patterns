package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

public class Man extends Person {
    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

    @Override
    public void getConclusion() {
        if ("成功".equals(action)){
            System.out.println(Man.class + action + "时，背后多半有一个伟大的女人。");
        }else if ("失败".equals(action)){
            System.out.println(Man.class + action + "时，闷头喝酒，谁也不用劝。");
        }else if ("恋爱".equals(action)){
            System.out.println(Man.class + action + "时，凡事不懂也要装懂。");
        }
    }
}
