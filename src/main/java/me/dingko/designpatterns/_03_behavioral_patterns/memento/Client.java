package me.dingko.designpatterns._03_behavioral_patterns.memento;

public class Client {
    public static void main(String[] args) {
        Game game = new Game();
        game.setRedTeamScore(10);
        game.setBlueTeamScore(20);

        //각 팀의 스코어를 밖에다가 꺼냄
        int redTeamScore = game.getRedTeamScore();
        int blueTeamScore = game.getBlueTeamScore();

        //다시 시작할 때 꺼냈던 값을 넣어줌
        Game restoreGame = new Game();
        restoreGame.setRedTeamScore(redTeamScore);
        restoreGame.setBlueTeamScore(blueTeamScore);
    }
}
