package me.dingko.designpatterns._02_structure_patterns._06_flyweight.after;

public class FlywieghtInJava {
    public static void main(String[] args) {
        Integer i1 = Integer.valueOf(10);
        Integer i2 = Integer.valueOf(10);
        System.out.println(i1 == i2);
    }
}
