package me.dingko.book.strategy;

public class Main {
    public static void main(String[] args) {
        int seed1 = Integer.parseInt("8");
        int seed2 = Integer.parseInt("9");
        Player p1 = new Player("KIM", new WinningStrategy(seed1));
        Player p2 = new Player("LEE", new ProbStrategy(seed2));

        for (int i = 0; i < 100; i++) {
            Hand nextHand1 = p1.nextHand();
            Hand nextHand2 = p2.nextHand();

            if (nextHand1.isStrongThan(nextHand2)) {
                System.out.println("Winnder = " + p1);
                p1.win();
                p2.lose();
            } else if (nextHand1.isWeakerThan(nextHand2)) {
                System.out.println("Winner = " + p2);
                p2.win();
                p1.lose();
            } else {
                System.out.println("비김");
                p1.even();
                p2.even();
            }
        }
        System.out.println("합계 : ");
        System.out.println(p1);
        System.out.println(p2);
    }
}
