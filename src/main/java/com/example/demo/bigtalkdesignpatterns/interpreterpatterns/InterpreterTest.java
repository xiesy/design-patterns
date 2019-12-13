package com.example.demo.bigtalkdesignpatterns.interpreterpatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * 解释器模式测试类
 * @author xsy
 */
public class InterpreterTest {
    public static void main(String[] args) {
        Context context = new Context();
        List<AbstractExpression> list = new ArrayList<>();
        list.add(new TerminalExpression());
        list.add(new NonterminalExpression());
        list.add(new TerminalExpression());
        list.add(new TerminalExpression());
        for (AbstractExpression expression:list) {
            expression.interpret(context);
        }
    }
}
