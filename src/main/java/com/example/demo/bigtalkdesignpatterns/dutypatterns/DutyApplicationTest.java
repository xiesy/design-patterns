package com.example.demo.bigtalkdesignpatterns.dutypatterns;

/**
 * 责任链模式测试类
 * @author xsy
 */
public class DutyApplicationTest {

    public static void main(String[] args) {
        CommonManger jinli = new CommonManger("经理:");
        MajordomoManger zongjian = new MajordomoManger("总监:");
        GeneralManger zongjingli = new GeneralManger("总经理:");
        jinli.setManager(zongjian);
        zongjian.setManager(zongjingli);

        Request request = new Request();
        request.setRequestType("请假");
        request.setNumber(1);
        request.setRequestContent("小谢请假");
        jinli.requestApplications(request);

        Request request1 = new Request();
        request1.setRequestType("请假");
        request1.setNumber(4);
        request1.setRequestContent("小谢请假");
        jinli.requestApplications(request1);

        Request request2 = new Request();
        request2.setRequestType("加薪");
        request2.setNumber(500);
        request2.setRequestContent("小谢请求加薪");
        jinli.requestApplications(request2);

        Request request3 = new Request();
        request3.setRequestType("加薪");
        request3.setNumber(1000);
        request3.setRequestContent("小谢请求加薪");
        jinli.requestApplications(request3);
    }
}
