package me.dingko.designpatterns._03_behavioral_patterns.command.after;

import me.dingko.designpatterns._03_behavioral_patterns.command.Game;

public class App {
    private Command command;

    public App(Command command) {
        this.command = command;
    }

    public void press(){
        command.execute();
    }

    public static void main(String[] args) {
        App app = new App(new GameEndCommand(new Game()));
        app.press();
    }
}
