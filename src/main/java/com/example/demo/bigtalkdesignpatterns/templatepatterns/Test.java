package com.example.demo.bigtalkdesignpatterns.templatepatterns;

/**
 * 模板模式
 */
public class Test {
    public static void main(String[] args){
        AbstractClass abstractClass = new ConcreteClassA();
        abstractClass.TemplateMethod();
        abstractClass = new ConcreteClassB();
        abstractClass.TemplateMethod();
    }
}
