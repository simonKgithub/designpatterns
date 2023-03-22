package me.dingko.designpatterns._03_behavioral_patterns.strategy.after;

public class Faster implements Speed{
    @Override
    public void blueLight() {
        System.out.println("무궁화꽃이");
    }

    @Override
    public void redLight() {
        System.out.println("폈습니다!");
    }
}
