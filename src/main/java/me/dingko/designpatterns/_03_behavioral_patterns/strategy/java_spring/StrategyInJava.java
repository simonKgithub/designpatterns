package me.dingko.designpatterns._03_behavioral_patterns.strategy.java_spring;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class StrategyInJava {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(5);

        //들어간 순서대로 출력
        System.out.println(numbers);

        // 숫자 크기대로 정렬
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        System.out.println(numbers);

        //자바8부터 지원
        Collections.sort(numbers, Comparator.naturalOrder());
        Collections.sort(numbers, Comparator.reverseOrder());

    }
}
