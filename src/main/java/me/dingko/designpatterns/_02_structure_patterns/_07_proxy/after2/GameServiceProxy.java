package me.dingko.designpatterns._02_structure_patterns._07_proxy.after2;

public class GameServiceProxy implements GameService {
    private GameService gameService;

    @Override
    public void startGame() {
        long before = System.currentTimeMillis();
        if (this.gameService == null) {
            this.gameService = new DefaultGameService();
        }
        gameService.startGame();
        System.out.println(System.currentTimeMillis() - before);
    }
}
