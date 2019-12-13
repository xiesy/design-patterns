package com.example.demo.bigtalkdesignpatterns.flyweightpatterns;


import java.util.Hashtable;

public class FlyweightFactory {

    private Hashtable<String, Object> hashtable = new Hashtable<>();

    public FlyweightFactory(){
        hashtable.put("X", new ConcreteFlyweight());
        hashtable.put("Y", new ConcreteFlyweight());
        hashtable.put("Z", new ConcreteFlyweight());
    }

    public Flyweight getFlyweight(String key){
        return (Flyweight) hashtable.get(key);
    }

}
