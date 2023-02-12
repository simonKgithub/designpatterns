package me.dingko.designpatterns._02_structure_patterns._04_decorator;

public class SpamFilteringCommentService extends CommentService{
    @Override
    public void addComment(String comment) {
        boolean isSpam = isSpam(comment);
        if (!isSpam) {
            super.addComment(comment);
        }
    }

    private boolean isSpam(String comment) {
        return comment.contains("http");
    }
}
