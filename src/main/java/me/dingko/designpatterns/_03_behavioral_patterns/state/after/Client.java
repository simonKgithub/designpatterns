package me.dingko.designpatterns._03_behavioral_patterns.state.after;

public class Client {
    public static void main(String[] args) {
        OnlineCourse onlineCourse = new OnlineCourse();
        Student dingko = new Student("dingko");
        Student extra = new Student("extra");

        extra.addPrivate(onlineCourse);

        onlineCourse.addStudent(dingko);

        onlineCourse.changeState(new Private(onlineCourse));

        onlineCourse.addReview("hello", dingko);

        onlineCourse.addStudent(extra);

        System.out.println(onlineCourse.getReviews());
        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
    }
}
