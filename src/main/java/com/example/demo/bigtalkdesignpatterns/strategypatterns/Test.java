package com.example.demo.bigtalkdesignpatterns.strategypatterns;

/**
 * 策略模式
 */
public class Test {
    public static void main(String[] args){
        Context context;
        context = new Context(new ConcreteStrategyA());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyB());
        context.ContextInterface();
        context = new Context(new ConcreteStrategyC());
        context.ContextInterface();
//        CashContext cashContext = new CashContext("满300减100");
//        System.out.println(cashContext.getResult(400));
    }
}
