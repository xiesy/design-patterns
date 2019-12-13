package com.example.demo.bigtalkdesignpatterns.builderpatterns;

import java.util.ArrayList;
import java.util.List;

public class Product {

    List<String> list = new ArrayList<>();

    public void add(String part){
        list.add(part);
    }
    public void show(){
        System.out.println("产品 创建 ---");
        for (String part: list) {
            System.out.println(part);
        }
    }

}
