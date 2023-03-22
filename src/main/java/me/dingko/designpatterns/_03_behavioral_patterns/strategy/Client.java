package me.dingko.designpatterns._03_behavioral_patterns.strategy;

public class Client {
    public static void main(String[] args) {
        BlueLightRedLight blueLightRedLight = new BlueLightRedLight(2);
        blueLightRedLight.blueLight();
        blueLightRedLight.redLight();
    }
}
