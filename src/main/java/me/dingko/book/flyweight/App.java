package me.dingko.book.flyweight;

public class App {
    private static BigString[] bsarray = new BigString[10000];

    public static void main(String[] args) {
        /* 예제 2 */
        System.out.println("공유한 경우 : ");
        testAllocation(true);
        System.out.println("공유하지 않은 경우 : ");
        testAllocation(false);

//        if (args.length == 0) {
//            System.out.println("Usage: java App digits");
//            System.out.println("Example: java App 1212123");
//            System.exit(0);
//        }
        /* 예제 1
        BigString bs = new BigString("1212123", true);
        bs.print();
         */
    }

    private static void testAllocation(boolean shared) {
        for (int i = 0; i < bsarray.length; i++) {
            bsarray[i] = new BigString("1212123", shared);
        }
        showMemory();
    }

    private static void showMemory() {
        Runtime.getRuntime().gc();
        long used = Runtime.getRuntime().totalMemory() - Runtime.getRuntime().freeMemory();
        System.out.println("사용 메모리 = " + used);
    }
}
