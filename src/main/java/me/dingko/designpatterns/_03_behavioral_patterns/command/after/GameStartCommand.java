package me.dingko.designpatterns._03_behavioral_patterns.command.after;

import me.dingko.designpatterns._03_behavioral_patterns.command.Game;

public class GameStartCommand implements Command{

    private Game game;

    public GameStartCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.start();
    }

    @Override
    public void undo() {
        //게임을 실행하는 커맨드의 undo는 게임을 종료하는 것
        new GameEndCommand(this.game).execute();
    }
}
