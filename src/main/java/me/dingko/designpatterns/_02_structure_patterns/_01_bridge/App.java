package me.dingko.designpatterns._02_structure_patterns._01_bridge;

public class App {
    public static void main(String[] args) {
        Champion kda아리 = new 아리(new KDA());
        kda아리.skillE();
        kda아리.skillR();

        Champion poolPart아카리 = new 아카리(new PoolPart());
        poolPart아카리.skillE();
        poolPart아카리.skillR();
    }
}
