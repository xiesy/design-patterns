package com.example.demo.bigtalkdesignpatterns.statuspatterns;

public class NoonState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.getHour() < 13){
            System.out.println("当前时间：" + work.getHour() + "点 饿了，午饭；犯困，午休");
        }else {
            work.setCurrent(new AfternoonState());
            work.writeProgram();
        }
    }
}
