package me.dingko.book.strategy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Practice {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("D", "B", "C", "E", "A");

        //사전 순으로 작은 순서
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(list);

        //사전 순으로 큰 순서
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println(list);
    }
}
