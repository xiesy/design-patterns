package com.example.demo.bigtalkdesignpatterns.dutypatterns;

public class MajordomoManger extends Manager {

    public MajordomoManger(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType()) && request.getNumber() <= 5){
            System.out.println(name + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
        } else {
          if (manager != null){
              manager.requestApplications(request);
          }
        }
    }
}
