package com.example.demo.bigtalkdesignpatterns.commandpatterns;

public class CommandTest {

    public static void main(String[] args) {
        Barbecuer barbecuer = new Barbecuer();
        Command command1 = new BakeMuttonCommand(barbecuer);
        Command command2 = new BakeMuttonCommand(barbecuer);
        Command command3 = new BakeChickenWingCommand(barbecuer);
        Waiter girl = new Waiter();
        girl.setOrder(command1);
        girl.setOrder(command2);
        girl.setOrder(command3);
        girl.notifys();
    }
}
