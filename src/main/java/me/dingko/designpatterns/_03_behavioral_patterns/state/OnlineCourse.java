package me.dingko.designpatterns._03_behavioral_patterns.state;

import java.util.ArrayList;
import java.util.List;

public class OnlineCourse {

    public enum State{
        DRAFT, PUBLISHED, PRIVATE
    }

    private State state = State.DRAFT;

    private List<String> reviews = new ArrayList<>();

    private List<Student> students = new ArrayList<>();

    public void addReview(String review, Student student) {
        if (this.state == State.PUBLISHED) {
            this.reviews.add(review);
        } else if (this.state == State.PRIVATE && this.students.contains(student)) {
            this.reviews.add(review);
        } else {
            throw new UnsupportedOperationException("드래프트 상태에서는 리뷰를 작성할 수 없습니다.");
        }
    }

    public void addStudent(Student student) {
        if (this.state == State.DRAFT || this.state == State.PUBLISHED) {
            this.students.add(student);
        } else if (this.state == State.PRIVATE && availableTo(student)) {
            this.students.add(student);
        } else {
            throw new UnsupportedOperationException("학생을 해당 수업에 추가할 수 없습니다.");
        }

        //만일 학생이 2명 이상이 되면, 자동으로 PRIVATE 상태로 전환된다.
        if (this.students.size() > 1) {
            this.state = State.PRIVATE;
        }
    }

    public void changeState(State newState) {
        this.state = newState;
    }

    public State getState(){
        return state;
    }

    public List<String> getReviews(){
        return reviews;
    }
    public List<Student> getStudents() {
        return students;
    }
    private boolean availableTo(Student student) {
        return student.isEnabledForPrivateClass(this);
    }
}

