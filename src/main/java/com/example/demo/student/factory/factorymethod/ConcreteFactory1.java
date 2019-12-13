package com.example.demo.student.factory.factorymethod;

import com.example.demo.student.factory.simplefactory.ConcreteProduct1;
import com.example.demo.student.factory.simplefactory.Product;

public class ConcreteFactory1 extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct1();
    }
}
