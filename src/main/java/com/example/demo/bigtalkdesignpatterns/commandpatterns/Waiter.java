package com.example.demo.bigtalkdesignpatterns.commandpatterns;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Waiter {

    private List<Command> commandList = new ArrayList<>();

    public void setOrder(Command command){
        if (command.toString().equals("com.example.demo.bigtalkdesignpatterns.commandpatterns.BakeChickenWingCommand@326de728")){
            System.out.println("服务员：鸡翅没有了，请点别的烧烤");
        }else {
            commandList.add(command);
            System.out.println("增加订单:" + command.toString() + "时间：" + new Date().toString());
        }

    }

    public void cancelOrder(Command command){
        commandList.remove(command);
        System.out.println("取消订单:" + command.toString() + "时间：" + new Date());
    }

    public void notifys(){
        for (Command command: commandList){
            command.excuteCommand();
        }

    }

}
