package com.example.demo.bigtalkdesignpatterns.statuspatterns;

public class Work {
    private int hour;
    private State current;

    public Work(){
        current = new ForenoonState();
    }
    public State getCurrent() {
        return current;
    }

    public void setCurrent(State current) {
        this.current = current;
    }

    public boolean isFinish() {
        return finish;
    }

    public void setFinish(boolean finish) {
        this.finish = finish;
    }

    private boolean finish = false;

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void writeProgram(){
        current.writeProgram(this);
    }
}
