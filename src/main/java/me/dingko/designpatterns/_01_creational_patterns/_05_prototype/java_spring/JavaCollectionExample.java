package me.dingko.designpatterns._01_creational_patterns._05_prototype.java_spring;

import java.util.ArrayList;
import java.util.List;

public class JavaCollectionExample {
    public static void main(String[] args) {
        Student dingko = new Student("dingko");
        Student simon = new Student("simon");
//        ArrayList<Student> students = new ArrayList<>();
        List<Student> students = new ArrayList<>();
        students.add(dingko);
        students.add(simon);


        /**
         * List<> 에서는 clone() 메서드를 지원해주지 않는다.
         *  - Collection 복사 방법
         *   1) ArrayList<> 생성자를 사용하는 방법
         */
        List<Student> clone = new ArrayList<>(students);
        System.out.println(students != clone);
        System.out.println(students.getClass() == clone.getClass());
        System.out.println(students.equals(clone));


        /**
         * ArrayList 에서는 clone() 메서드를 지원해준다.
         *  - Cloneable 인터페이스를 상속받음
         */
//        ArrayList<Student> clone = (ArrayList<Student>) students.clone();
    }
}
