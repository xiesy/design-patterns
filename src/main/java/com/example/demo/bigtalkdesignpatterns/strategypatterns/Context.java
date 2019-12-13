package com.example.demo.bigtalkdesignpatterns.strategypatterns;


public class Context {

    Strategy strategy;
    public Context(Strategy strategy){
        this.strategy = strategy;
    }
    public void ContextInterface(){
        strategy.AlgorithmInterface();
    }

}
