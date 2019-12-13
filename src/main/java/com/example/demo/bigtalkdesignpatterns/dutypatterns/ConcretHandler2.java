package com.example.demo.bigtalkdesignpatterns.dutypatterns;

public class ConcretHandler2 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 10 && request < 20){
            System.out.println("2处理请求" + request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }

}
