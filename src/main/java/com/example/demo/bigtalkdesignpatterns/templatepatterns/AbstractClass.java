package com.example.demo.bigtalkdesignpatterns.templatepatterns;

public abstract class AbstractClass {

    public abstract void primitiveOperationl1();

    public abstract void primitiveOperationl2();

    public void TemplateMethod(){
        primitiveOperationl1();
        primitiveOperationl2();
        System.out.println(" ");
    }

}
