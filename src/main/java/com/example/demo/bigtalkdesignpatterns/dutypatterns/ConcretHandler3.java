package com.example.demo.bigtalkdesignpatterns.dutypatterns;

public class ConcretHandler3 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 20 && request < 30){
            System.out.println("3处理请求" + request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }

}
