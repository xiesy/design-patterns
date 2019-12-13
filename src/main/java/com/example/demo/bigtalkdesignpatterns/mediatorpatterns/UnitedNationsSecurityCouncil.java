package com.example.demo.bigtalkdesignpatterns.mediatorpatterns;

public class UnitedNationsSecurityCouncil extends UnitedNations {

    private Usa usa;
    private Iraq iraq;

    public Usa getUsa() {
        return usa;
    }

    public void setUsa(Usa usa) {
        this.usa = usa;
    }

    public Iraq getIraq() {
        return iraq;
    }

    public void setIraq(Iraq iraq) {
        this.iraq = iraq;
    }

    @Override
    public void declare(String message, Country country) {
        if (country == usa){
            iraq.getMessage(message);
        }else {
            usa.getMessage(message);
        }
    }
}
