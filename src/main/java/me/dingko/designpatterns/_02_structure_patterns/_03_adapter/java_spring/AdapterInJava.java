package me.dingko.designpatterns._02_structure_patterns._03_adapter.java_spring;

import java.io.*;
import java.util.*;

public class AdapterInJava {

    public static void main(String[] args) {
        /**
         * io 에서의 어댑터 패턴 적용 예시
         */
        try(InputStream is = new FileInputStream("input.txt");
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader reader = new BufferedReader(isr)
        ) {
            while (reader.ready()) {
                System.out.println(reader.readLine());
            }
        } catch (IOException e) {
            new RuntimeException(e);
        }

        /**
         * 콜렉션에서의 어댑터 패턴 적용 예시
         */
        List<String> strings = Arrays.asList("a", "b", "c"); // 배열을 리스트로 바꿔줌(상이한 인터페이스)
        Enumeration<String> enumeration = Collections.enumeration(strings); // 리스트(콜렉션)을 enumeration 타입으로 바꿔줌
        ArrayList<String> list = Collections.list(enumeration); // enumeration 타입을 리스트로 반환해줌

    }
}
