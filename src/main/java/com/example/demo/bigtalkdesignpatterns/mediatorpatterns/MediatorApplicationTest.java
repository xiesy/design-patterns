package com.example.demo.bigtalkdesignpatterns.mediatorpatterns;

public class MediatorApplicationTest {

    public static void main(String[] args) {
        UnitedNationsSecurityCouncil council = new UnitedNationsSecurityCouncil();

        Usa usa = new Usa(council);
        Iraq iraq = new Iraq(council);

        council.setUsa(usa);
        council.setIraq(iraq);

        usa.declare("我要打你！");
        iraq.declare("能不打吗？");



    }

}
