package com.example.demo.bigtalkdesignpatterns.prototypepatterns;

public class Prototype implements Cloneable {


    @Override
    public Prototype clone() {
        Prototype prototype = null;
        try {
            prototype = (Prototype)super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return prototype;
    }


}
