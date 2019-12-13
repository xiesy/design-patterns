package com.example.demo.bigtalkdesignpatterns.Iteratorpatterns;

public class IteratorTest {

    public static void main(String[] args) {
        Aggregate aggregate = new ConcreteAggregate();
        Iterator<Integer> iterator = aggregate.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
