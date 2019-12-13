package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

import java.util.ArrayList;
import java.util.List;

/**
 * 访问者模式测试类
 * @author xsy
 */
public class VisitorsTest {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();
        Person man1 = new Man();
        man1.setAction("成功");
        persons.add(man1);
        Person woman1 = new Woman();
        woman1.setAction("成功");
        persons.add(woman1);

        Person man2 = new Man();
        man2.setAction("失败");
        persons.add(man2);
        Person woman2 = new Woman();
        woman2.setAction("失败");
        persons.add(woman2);

        Person man3 = new Man();
        man3.setAction("恋爱");
        persons.add(man3);
        Person woman3 = new Woman();
        woman3.setAction("恋爱");
        persons.add(woman3);

        for (Person p:persons) {
            p.getConclusion();
        }

    }
}
