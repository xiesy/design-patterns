package com.example.demo.bigtalkdesignpatterns.adapterpatterns;

/**
 * 适配器模式测试类
 */
public class AdapterTest {

    public static void main(String[] args){
        Target target = new Adapter();
        target.request();

        Player player = new Forwards("巴蒂尔");
        player.attack();
        Player m = new Guards("麦迪");
        m.attack();
        Player y = new Translator("姚明");
        y.attack();
    }
}
