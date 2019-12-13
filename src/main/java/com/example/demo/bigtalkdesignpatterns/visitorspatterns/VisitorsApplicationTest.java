package com.example.demo.bigtalkdesignpatterns.visitorspatterns;

public class VisitorsApplicationTest {
    public static void main(String[] args) {
        ObjectStructure o = new ObjectStructure();
        o.attch(new Man());
        o.attch(new Woman());

        Success v1 = new Success();
        o.display(v1);

        Failing v2 = new Failing();
        o.display(v2);

        Amativeness v3 = new Amativeness();
        o.display(v3);
    }
}
