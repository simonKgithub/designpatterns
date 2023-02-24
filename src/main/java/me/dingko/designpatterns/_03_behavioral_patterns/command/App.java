package me.dingko.designpatterns._03_behavioral_patterns.command;

public class App {
    private Game game;

    public App(Game game) {
        this.game = game;
    }

    public void press(){
        game.start();
    }

    public static void main(String[] args) {
        App app = new App(new Game());
        app.press();
        app.press();
        app.press();
    }
}
