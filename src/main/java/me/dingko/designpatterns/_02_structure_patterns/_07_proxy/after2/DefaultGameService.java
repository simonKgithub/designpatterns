package me.dingko.designpatterns._02_structure_patterns._07_proxy.after2;

public class DefaultGameService implements GameService{
    @Override
    public void startGame() {
        System.out.println("게임이 시작되었습니다.");
    }
}
