package me.dingko.designpatterns._02_structure_patterns._04_decorator._after;

public class TrimmingCommentDecorator extends CommentDecorator{
    public TrimmingCommentDecorator(CommentService commentService) {
        super(commentService);
    }

    @Override
    public void addComment(String comment) {
        super.addComment(trim(comment));
    }

    private String trim(String comment) {
        return comment.replace("...", "");
    }
}
