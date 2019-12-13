package com.example.demo.bigtalkdesignpatterns.prototypepatterns;

/**
 * 原型模式
 */

public class Test {

    public static void main(String[] args){
        Resume a = new Resume("大鸟");
        a.setPersonalInfo("男", "29");
        a.setWorkExperience("1998-2000", "xx公司");
        Resume b = a.clone();
        b.setWorkExperience("2000-2006", "YY企业");
        Resume c = a.clone();
        c.setWorkExperience("1998-2003", "zz企业");
        a.display();
        b.display();
        c.display();
    }

}
