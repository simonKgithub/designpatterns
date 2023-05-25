package me.dingko.designpatterns._01_creational_patterns._04_builder.java_spring;

public class StringBuilderExample {

    public static void main(String[] args) {

        /**
         * StringBuilder: Synchronized 를 쓰지 않는 객체이다.
         */
        StringBuilder sb = new StringBuilder();
        String result = sb.append("qwer").append("asdf").append("zxcv").toString();
        System.out.println(result);


    }
}
