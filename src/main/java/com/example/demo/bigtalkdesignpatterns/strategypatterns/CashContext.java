package com.example.demo.bigtalkdesignpatterns.strategypatterns;

import com.example.demo.bigtalkdesignpatterns.simplefactory.CashNormal;
import com.example.demo.bigtalkdesignpatterns.simplefactory.CashRebate;
import com.example.demo.bigtalkdesignpatterns.simplefactory.CashReturn;
import com.example.demo.bigtalkdesignpatterns.simplefactory.CashSuper;

public class CashContext {

    private CashSuper cashSuper;

    public CashContext(String type){
        switch (type){
            case "正常收费":
                CashNormal cashNormal = new CashNormal();
                    cashSuper = cashNormal;
                break;
            case "满300减100":
                CashReturn cashReturn = new CashReturn("300","100");
                cashSuper = cashReturn;
                break;
            case "打8折":
                CashRebate cashRebate = new CashRebate("0.8");
                cashSuper = cashRebate;
                break;
            default:
                break;
        }
    }

    public double getResult(double money){
        return cashSuper.acceptCash(money);
    }

}
