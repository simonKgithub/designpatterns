package me.dingko.designpatterns._02_structure_patterns._07_proxy;

public class Client {
    public static void main(String[] args) {
        GameService gameService = new GameService();
        //시간체크
        long timecheck = System.currentTimeMillis();
        gameService.startGame();
        System.out.println("이용시간 : " + (System.currentTimeMillis() - timecheck) );
    }
}
