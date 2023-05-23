package me.dingko.designpatterns._01_creational_patterns._01_singleton;

public class RuntimeExample {

    public static void main(String[] args) {
        // Runtime.class 자바 애플리케이션이 실행되는 문맥 정보를 가짐
        Runtime runtime = Runtime.getRuntime(); //스레드 safe
        System.out.println(runtime.maxMemory());
        System.out.println(runtime.freeMemory());

        //스프링에서는 싱글톤scope으로 bean 설정하여 사용한다.
    }
}
