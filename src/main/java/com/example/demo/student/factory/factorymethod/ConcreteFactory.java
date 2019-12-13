package com.example.demo.student.factory.factorymethod;

import com.example.demo.student.factory.simplefactory.ConcreteProduct;
import com.example.demo.student.factory.simplefactory.Product;

public class ConcreteFactory extends Factory {

    @Override
    public Product factoryMethod() {
        return new ConcreteProduct();
    }
}
