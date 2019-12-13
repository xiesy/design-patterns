package com.example.demo.bigtalkdesignpatterns.dutypatterns;

public class ConcretHandler1 extends Handler {

    @Override
    public void handleRequest(int request) {
        if (request >= 0 && request < 10){
            System.out.println("1处理请求" + request);
        }else if (successor != null){
            successor.handleRequest(request);
        }
    }

}
