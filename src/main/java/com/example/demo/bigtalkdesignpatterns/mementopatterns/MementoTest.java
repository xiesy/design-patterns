package com.example.demo.bigtalkdesignpatterns.mementopatterns;

public class MementoTest {

    public static void main(String[] args) {
        Originator o = new Originator();
        o.setState("On");
        o.show();
        Caretaker caretaker = new Caretaker();
        caretaker.setMemento(o.createMemento());
        //改变状态
        o.setState("Off");
        o.show();
        //恢复原始状态
        o.setMemento(caretaker.getMemento());
        o.show();

        GameRole gameRole = new GameRole();
        gameRole.setAtk(10);
        gameRole.setVit(100);
        gameRole.setDef(1000);
        gameRole.show();
        GameCaretaker gameCaretaker = new GameCaretaker();
        gameCaretaker.setGameMemento(gameRole.createGameMemento());
        //打boss后状态清零
        gameRole.fight();
        gameRole.show();
        //恢复状态
        gameRole.setGameMemento(gameCaretaker.getGameMemento());
        gameRole.show();

    }

}
