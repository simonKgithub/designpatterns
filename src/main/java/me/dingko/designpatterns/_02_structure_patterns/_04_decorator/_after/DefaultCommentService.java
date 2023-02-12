package me.dingko.designpatterns._02_structure_patterns._04_decorator._after;

public class DefaultCommentService implements CommentService{
    @Override
    public void addComment(String comment) {
        System.out.println(comment);
    }
}
