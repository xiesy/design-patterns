package com.example.demo.bigtalkdesignpatterns.decorationpatterns;

public  class Person {

    public Person() {}

    private String name;
    public Person(String name){
        this.name = name;
    }

    public void show(){
        System.out.println("装扮的{0}" + name);
    }

}
