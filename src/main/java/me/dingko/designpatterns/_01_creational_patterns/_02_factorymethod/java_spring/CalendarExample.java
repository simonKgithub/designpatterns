package me.dingko.designpatterns._01_creational_patterns._02_factorymethod.java_spring;

import java.util.Calendar;
import java.util.Locale;

public class CalendarExample {

    public static void main(String[] args) {
        /**
         * 하나의 Creator(Calendar)로 넘기는 파라미터에 따라 구현 클래스들이 달라짐
         *  - 즉, 여러 concreteCreator 를 만들 필요 없음
         */
        System.out.println(Calendar.getInstance().getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("th-TH-x-lvariant-TH")).getClass());
        System.out.println(Calendar.getInstance(Locale.forLanguageTag("ja-JP-x-lvariant-JP")).getClass());
    }
}
