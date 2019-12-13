package com.example.demo.bigtalkdesignpatterns.interpreterpatterns;

public class Scale extends Expression {
    @Override
    public void Excute(String playKey, double playValue) {
        String scale;
        switch ((int) playValue){
            case 1:
                scale = "低音";
                break;
            case 2:
                scale = "中音";
                break;
            case 3:
                scale = "高音";
                break;
            default:
                scale = "五音";
                break;
        }
        System.out.println(scale);
    }
}
