package me.dingko.designpatterns._03_behavioral_patterns.state;

public class Client {
    public static void main(String[] args) {
        Student dingko_ = new Student("dingko_");
        Student extra = new Student("extra");

        OnlineCourse onlineCourse = new OnlineCourse();

        extra.addPrivateCourse(onlineCourse);

        onlineCourse.addStudent(extra);
        onlineCourse.changeState(OnlineCourse.State.PRIVATE);

//        onlineCourse.addStudent(dingko_);

        onlineCourse.addReview("hello", extra);

        System.out.println(onlineCourse.getState());
        System.out.println(onlineCourse.getStudents());
        System.out.println(onlineCourse.getReviews());
    }
}
