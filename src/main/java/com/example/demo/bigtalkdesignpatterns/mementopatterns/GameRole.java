package com.example.demo.bigtalkdesignpatterns.mementopatterns;

public class GameRole {

    private int vit;
    private int atk;
    private int def;

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public GameMemento createGameMemento(){
        return new GameMemento(vit, atk, def);
    }

    public void setGameMemento(GameMemento gameMemento){
        vit = gameMemento.getVit();
        atk = gameMemento.getAtk();
        def = gameMemento.getDef();
    }

    public void show(){
        System.out.println("属性：体力-" + vit + ";攻击力-" + atk + ";防御力-" + def);
    }
}
