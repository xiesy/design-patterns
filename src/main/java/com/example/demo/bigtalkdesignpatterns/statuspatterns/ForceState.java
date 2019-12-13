package com.example.demo.bigtalkdesignpatterns.statuspatterns;

public class ForceState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间：" + work.getHour() + "点 强制下班");
    }
}
