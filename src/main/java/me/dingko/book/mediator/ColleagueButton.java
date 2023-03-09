package me.dingko.book.mediator;

import java.awt.*;

public class ColleagueButton extends Button implements Colleague {
    //이 객체는 Mediator에 의존한다.
    private Mediator mediator;

    public ColleagueButton(String caption) {
        super(caption);
    }

    // Mediator를 설정한다.
    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    // Mediator에서 활성/비활성을 지시한다.
    @Override
    public void setColleagueEnabled(boolean enabled) {
        setEnabled(enabled);
    }
}
