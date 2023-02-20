package me.dingko.designpatterns._02_structure_patterns._07_proxy.after2;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameServiceProxy();
        gameService.startGame();
    }
}
