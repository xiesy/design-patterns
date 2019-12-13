package com.example.demo.bigtalkdesignpatterns.decorationpatterns;

/**
 * 装饰模式
 */
public class Test {

    public static void main(String[] args){
        Person person = new Person("测试");
        System.out.println("第一种组装扮");
        Sneakers sneakers = new Sneakers();
        BigTrouser bigTrouser = new BigTrouser();
        Tshirts tshirts = new Tshirts();

        sneakers.Decorate(person);
        bigTrouser.Decorate(sneakers);
        tshirts.Decorate(bigTrouser);
        tshirts.show();
    }

}
