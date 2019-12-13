package com.example.demo.bigtalkdesignpatterns.statuspatterns;

public class EveningState extends State {
    @Override
    public void writeProgram(Work work) {
        if (work.isFinish()){
            work.setCurrent(new RestState());
            work.writeProgram();
        }else {
           if (work.getHour() < 20){
               System.out.println("当前时间：" + work.getHour() + "点 加班喔，疲惫至极");
           }else {
               work.setCurrent(new ForceState());
               work.writeProgram();
           }
        }
    }
}
