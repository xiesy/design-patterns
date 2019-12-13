package com.example.demo.bigtalkdesignpatterns.dutypatterns;

/**
 * 责任链模式测试类
 * @author xsy
 */
public class DutyTest {

    public static void main(String[] args) {
        Handler handler1 = new ConcretHandler1();
        Handler handler2 = new ConcretHandler2();
        Handler handler3 = new ConcretHandler3();
        handler1.setSuccessor(handler2);
        handler2.setSuccessor(handler3);

        int[] requests= {2,5,14,22,18,3,27,20};

        for (int request: requests) {
            handler1.handleRequest(request);
        }
    }
}
