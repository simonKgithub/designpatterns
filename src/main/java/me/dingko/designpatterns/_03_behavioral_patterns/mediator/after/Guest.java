package me.dingko.designpatterns._03_behavioral_patterns.mediator.after;

import java.time.LocalDateTime;

public class Guest {
    private int id;

    private FrontDesk frontDesk = new FrontDesk();

    //만일 타월을 원하면, 프론트데스크에 요청한다.
    public void getTowers(int numberOfTowers) {
        this.frontDesk.getTowers(this, numberOfTowers);
    }

    //만일 저녁을 먹고싶다면, 프론트데스크에 요청한다.
    private void dinner(LocalDateTime dateTime) {
        this.frontDesk.dinner(this, dateTime); //저녁을 이 시간에 먹고싶다.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
