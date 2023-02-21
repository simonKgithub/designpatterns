package me.dingko.book.chainofresponsibility;

public class Trouble {
    private int number; //트러블번호

    //트러블 생성
    public Trouble(int number) {
        this.number = number;
    }

    //트러블 번호를 얻음
    public int getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "[Trouble " + number + ']';
    }
}
