package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

public class Woman extends Person {

    @Override
    public void accept(Action visitor) {
        visitor.getManConclusion(this);
    }

    @Override
    public void getConclusion() {
        if ("成功".equals(action)){
            System.out.println(Woman.class + action + "时，背后多半有一个不成功的男人。");
        }else if ("失败".equals(action)){
            System.out.println(Woman.class + action + "时，眼泪汪汪，谁也劝不了。");
        }else if ("恋爱".equals(action)){
            System.out.println(Woman.class + action + "时，遇事懂也装作不懂。");
        }
    }
}
