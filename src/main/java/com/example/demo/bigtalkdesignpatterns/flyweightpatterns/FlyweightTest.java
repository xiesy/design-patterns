package com.example.demo.bigtalkdesignpatterns.flyweightpatterns;

import com.example.demo.bigtalkdesignpatterns.mediatorpatterns.UnitedNationsSecurityCouncil;

/**
 * 享元模式测试类
 * @author xsy
 */
public class FlyweightTest {

    public static void main(String[] args) {
        int extrinsicstate = 22;

        FlyweightFactory flyweightFactory = new FlyweightFactory();

        Flyweight fx = flyweightFactory.getFlyweight("X");
        fx.operation(--extrinsicstate);

        Flyweight fy = flyweightFactory.getFlyweight("Y");
        fy.operation(--extrinsicstate);

        Flyweight fz = flyweightFactory.getFlyweight("Z");
        fz.operation(--extrinsicstate);

        UnsharedConcreteFlyweight uf = new UnsharedConcreteFlyweight();
        uf.operation(--extrinsicstate);

    }
}
