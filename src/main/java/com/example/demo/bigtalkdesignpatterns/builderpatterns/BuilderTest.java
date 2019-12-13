package com.example.demo.bigtalkdesignpatterns.builderpatterns;

/**
 * @author xsy 建造者模式
 */
public class BuilderTest {

    public static void main(String[] args){
        Director director = new Director();
        Builder b1 = new ConcreteBuilder1();

        Builder b2 = new ConcreteBuilder2();

        director.construct(b1);
        Product p1 = b1.getResult();

        director.construct(b2);
        Product p2 = b2.getResult();

        p1.show();

        p2.show();
    }

}
