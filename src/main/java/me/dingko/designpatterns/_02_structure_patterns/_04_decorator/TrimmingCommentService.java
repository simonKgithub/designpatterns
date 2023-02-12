package me.dingko.designpatterns._02_structure_patterns._04_decorator;

public class TrimmingCommentService extends CommentService{
    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
