package com.example.demo.bigtalkdesignpatterns.mementopatterns;

public class GameCaretaker {

    private GameMemento gameMemento;

    public GameMemento getGameMemento() {
        return gameMemento;
    }

    public void setGameMemento(GameMemento gameMemento) {
        this.gameMemento = gameMemento;
    }
}
