package com.example.demo.bigtalkdesignpatterns.exteriorpatterns;

public class Fund {

    Stock1 gu1;
    Stock2 gu2;
    Stock3 gu3;
    NationalDebtl nationalDebtl;
    Realtyl realtyl;

    public Fund(){
        gu1 = new Stock1();
        gu2 = new Stock2();
        gu3 = new Stock3();

        nationalDebtl = new NationalDebtl();
        realtyl = new Realtyl();
    }
    public void buy(){
        gu1.buy();
        gu2.buy();
        gu3.buy();
        nationalDebtl.buy();
        realtyl.buy();
    }
}
