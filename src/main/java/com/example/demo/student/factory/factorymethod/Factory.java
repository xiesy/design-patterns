package com.example.demo.student.factory.factorymethod;

import com.example.demo.student.factory.simplefactory.Product;

/**
 *
 * @author xsy 2019-10-17
 */
public abstract class Factory {
    /**
     * 工厂方法
     * @return
     */
    abstract public Product factoryMethod();
    public void doSomething(){
        Product product  = factoryMethod();
    }

}
