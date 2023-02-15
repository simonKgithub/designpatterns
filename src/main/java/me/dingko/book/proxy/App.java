package me.dingko.book.proxy;

public class App {
    public static void main(String[] args) {
        Printable p = new PrinterProxy("Alice", "Printer");
        System.out.println("이름은 현재 " + p.getPrintName() + "입니다.");

        p.setPrintName("Bob");
        System.out.println("이름은 현재 " + p.getPrintName() + "입니다.");
        p.print("Hello world.");

        p.setPrintName("Shapp");
        System.out.println("이름은 현재 " + p.getPrintName() + "입니다.");
        p.print("Hello world2.");
    }
}
