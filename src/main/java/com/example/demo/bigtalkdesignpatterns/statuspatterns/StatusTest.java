package com.example.demo.bigtalkdesignpatterns.statuspatterns;

/**
 * 状态模式测试类
 */
public class StatusTest {

    public static void main(String[] args){
        Work work = new Work();
        work.setHour(9);
        work.writeProgram();
        work.setHour(10);
        work.writeProgram();
        work.setHour(12);
        work.writeProgram();
        work.setHour(13);
        work.writeProgram();
        work.setHour(14);
        work.writeProgram();
        work.setHour(17);
        work.writeProgram();
        work.setFinish(true);
        work.writeProgram();
        work.setHour(19);
        work.writeProgram();
        work.setHour(20);
        work.writeProgram();
    }

}
