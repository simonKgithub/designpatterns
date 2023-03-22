package me.dingko.designpatterns._03_behavioral_patterns.strategy.after;

public class Client {
    public static void main(String[] args) {
        //Normal 전략
        BlueLightRedLight game = new BlueLightRedLight();
        game.blueLight(new Normal());
        game.redLight(new Fastest());
    }
}