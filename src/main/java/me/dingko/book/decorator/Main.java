package me.dingko.book.decorator;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("hello, world");
        Display b2 = new SideBorder(b1, '#');
        Display b3 = new FullBorder(b2);
        Display b4 =
                new SideBorder(
                    new FullBorder(
                        new FullBorder(
                            new SideBorder(
                                new FullBorder(
                                    new StringDisplay("dingko_")
                                ),
                            '*')
                        )
                    )
                , '/');
        b1.show();
        b2.show();
        b3.show();
        b4.show();
    }
}
