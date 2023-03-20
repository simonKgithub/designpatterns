package me.dingko.designpatterns._03_behavioral_patterns.state.after;

public class Published implements State{

    private OnlineCourse onlineCourse;

    public Published(OnlineCourse onlineCourse) {
        this.onlineCourse = onlineCourse;
    }

    @Override
    public void addReview(String review, Student student) {
        this.onlineCourse.addReview(review, student);
    }

    @Override
    public void addStudent(Student student) {
        this.onlineCourse.addStudent(student);
    }
}
