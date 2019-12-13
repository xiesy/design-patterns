package com.example.demo.bigtalkdesignpatterns.adapterpatterns;

public class Translator extends Player {

    private ForeignCenter wjzf = new ForeignCenter();

    public Translator(String name){
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void attack() {
        wjzf.进攻();
    }

    @Override
    public void defense() {
        wjzf.防守();
    }
}
