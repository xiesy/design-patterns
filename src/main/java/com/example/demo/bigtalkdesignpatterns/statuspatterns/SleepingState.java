package com.example.demo.bigtalkdesignpatterns.statuspatterns;

public class SleepingState extends State {
    @Override
    public void writeProgram(Work work) {
        System.out.println("当前时间:" + work.getHour() + "点 不行了睡觉了");
    }
}
