package me.dingko.designpatterns._03_behavioral_patterns.strategy.after;

public class BlueLightRedLight {
    public void blueLight(Speed speed){
        speed.blueLight();
    }
    public void redLight(Speed speed){
        speed.redLight();
    }
}
