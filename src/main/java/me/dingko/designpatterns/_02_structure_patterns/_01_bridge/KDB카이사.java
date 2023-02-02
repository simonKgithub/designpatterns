package me.dingko.designpatterns._02_structure_patterns._01_bridge;

public class KDB카이사 implements Champion{

    @Override
    public void move() {
        System.out.println("KDB 카이사 move");
    }

    @Override
    public void skillQ() {
        System.out.println("KDB 카이사 Q");
    }

    @Override
    public void skillW() {
        System.out.println("KDB 카이사 Q");

    }

    @Override
    public void skillE() {
        System.out.println("KDB 카이사 Q");
    }

    @Override
    public void skillR() {
        System.out.println("KDB 카이사 R");
    }
}
