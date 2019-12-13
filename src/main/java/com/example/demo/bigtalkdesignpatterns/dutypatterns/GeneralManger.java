package com.example.demo.bigtalkdesignpatterns.dutypatterns;

public class GeneralManger extends Manager {

    public GeneralManger(String name) {
        super(name);
    }

    @Override
    public void requestApplications(Request request) {
        if ("请假".equals(request.getRequestType())){
            System.out.println(name + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
        }else if ("加薪".equals(request.getRequestType()) && request.getNumber() <= 500){
            System.out.println(name + request.getRequestContent() + "数量" + request.getNumber() + "被批准");
        }else if ("加薪".equals(request.getRequestType()) && request.getNumber() > 500){
            System.out.println(name + request.getRequestContent() + "数量" + request.getNumber() + "再说吧");
        }
    }
}
