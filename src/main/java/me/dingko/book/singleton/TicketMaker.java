package me.dingko.book.singleton;

public class TicketMaker {
    private int ticket;
    private static volatile TicketMaker singleton = new TicketMaker();

    private TicketMaker() {}

    public static TicketMaker getInstance() {
        return singleton;
    }

    public int getNextTicketNumber(){
        if (singleton == null) {
            synchronized (TicketMaker.class) {
                if (singleton == null) {
                    singleton = new TicketMaker();
                }
            }
        }
        return ticket++;
    }
}
