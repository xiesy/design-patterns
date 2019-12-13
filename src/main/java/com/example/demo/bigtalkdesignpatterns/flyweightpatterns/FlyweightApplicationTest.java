package com.example.demo.bigtalkdesignpatterns.flyweightpatterns;

public class FlyweightApplicationTest {
    public static void main(String[] args) {
        WebSiteFactory webSiteFactory = new WebSiteFactory();

        WebSite fx = webSiteFactory.getWebSiteCategory("产品展示");
        fx.user(new User("小菜"));

        WebSite fy = webSiteFactory.getWebSiteCategory("产品展示");
        fy.user(new User("大鸟"));

        WebSite fz = webSiteFactory.getWebSiteCategory("产品展示");
        fz.user(new User("娇娇"));

        WebSite fl = webSiteFactory.getWebSiteCategory("博客");
        fl.user(new User("老顽童"));

        WebSite fm = webSiteFactory.getWebSiteCategory("博客");
        fm.user(new User("桃谷六仙"));

        WebSite fn = webSiteFactory.getWebSiteCategory("博客");
        fn.user(new User("南鳄海神"));

        System.out.println("网站分类总数" +  webSiteFactory.getWebSiteCount());

    }
}
