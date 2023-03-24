package me.dingko.book.strategy;

public enum Hand {
    //가위바위보를 나타내는 세 개의 enum 상수
    ROCK("바위", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    //enum이 가진 필드
    private String name; //가위바위보 손의 이름
    private int handvalue; //가위바위보 손의 값

    //손의 값으로 상수를 얻기 위한 배열
    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    //생성자
    Hand(String name, int handvalue) {
        this.name = name;
        this.handvalue = handvalue;
    }

    //손의 값으로 enum 상수를 가져온다
    public static Hand getHand(int handvalue) {
        return hands[handvalue];
    }

    //this가 h보다 강할 때 true
    public boolean isStrongThan(Hand hand) {
        return fight(hand) == 1;
    }

    //this가 h보다 약할 때 true
    public boolean isWeakerThan(Hand hand) {
        return fight(hand) == -1;
    }

    //무승부는 0, this가 이기면 1, hand가 이기면 -1
    private int fight(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.handvalue + 1) % 3 == hand.handvalue) {
            return 1;
        } else {
            return -1;
        }
    }

    //가위바위보의 문자열 표현
    @Override
    public String toString() {
        return this.name;
    }
}
