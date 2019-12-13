package com.example.demo.bigtalkdesignpatterns.simplefactory;

public class CashFactory {

    public static CashSuper createCashAccept(String type){
        CashSuper cashSuper;
        switch (type){
            case "满300反100":
                CashSuper cashSuper1 = new CashReturn("300", "100");
                cashSuper = cashSuper1;
                break;
            case "打8折":
                CashSuper cashSuper2 = new CashRebate("0.8");
                cashSuper = cashSuper2;
                break;
            default :
                cashSuper = new CashNormal();
                break;
        }
        return cashSuper;
    }

}
