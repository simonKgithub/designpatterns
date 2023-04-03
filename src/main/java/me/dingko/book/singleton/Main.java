package me.dingko.book.singleton;

public class Main {
    public static void main(String[] args) {

        Triple a1 = Triple.getInstance("ALPHA");
        Triple b1 = Triple.getInstance("BETA");
        Triple c1 = Triple.getInstance("GAMMA");

        Triple a2 = Triple.getInstance("ALPHA");
        Triple b2 = Triple.getInstance("BETA");
        Triple c2 = Triple.getInstance("GAMMA");

        if (a1 == a2) {
            System.out.println("a1 == a2");
        } else {
            System.out.println("a1 != a2");
        }
        if (b1 == b2) {
            System.out.println("b1 == b2");
        } else {
            System.out.println("b1 != b2");
        }
        if (c1 == c2) {
            System.out.println("c1 == c2");
        } else {
            System.out.println("c1 != c2");
        }

        /*
        System.out.println("Start.");

        Singleton obj1 = Singleton.getInstance();
        Singleton obj2 = Singleton.getInstance();

        if (obj1 == obj2) {
            System.out.println("obj1과 obj2는 같은 인스턴스입니다.");
        } else {
            System.out.println("obj1과 obj2는 같은 인스턴스가 아닙니다.");
        }
        System.out.println("End.");*/
    }
}