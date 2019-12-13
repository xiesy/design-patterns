package com.example.demo.student.factory.factorymethod;

import com.example.demo.student.factory.simplefactory.ConcreteProduct2;
import com.example.demo.student.factory.simplefactory.Product;

public class ConcreteFactory2 extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct2();
    }
}
