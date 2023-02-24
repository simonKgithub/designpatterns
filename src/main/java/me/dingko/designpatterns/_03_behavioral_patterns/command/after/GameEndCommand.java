package me.dingko.designpatterns._03_behavioral_patterns.command.after;

import me.dingko.designpatterns._03_behavioral_patterns.command.Game;

public class GameEndCommand implements Command{

    private Game game;

    public GameEndCommand(Game game) {
        this.game = game;
    }

    @Override
    public void execute() {
        game.end();
    }

    @Override
    public void undo() {
        //게임을 종료하는 것의 undo는 게임을 실행하는 것
        new GameStartCommand(this.game).execute();
    }
}
