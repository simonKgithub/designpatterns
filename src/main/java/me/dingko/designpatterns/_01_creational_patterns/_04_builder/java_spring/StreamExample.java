package me.dingko.designpatterns._01_creational_patterns._04_builder.java_spring;

import java.util.stream.Stream;

public class StreamExample {

    public static void main(String[] args) {

//        Stream.Builder<String> strStreamBuilder = Stream.builder();
//        Stream<String> names = strStreamBuilder.add("qwer").add("asdf").add("zxcv").build();
        Stream<String> names = Stream.<String>builder().add("qwer").add("asdf").add("zxcv").build();
        names.forEach(System.out::println);
    }
}
