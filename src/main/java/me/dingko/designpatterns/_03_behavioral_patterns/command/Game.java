package me.dingko.designpatterns._03_behavioral_patterns.command;

public class Game {
    private boolean isOn;

    public void start(){
        System.out.println("게임을 시작합니다.");
        this.isOn = true;
    }

    public void end(){
        System.out.println("게임을 종료합니다.");
        this.isOn = false;
    }

    public boolean isOn() {
        return isOn;
    }
}
