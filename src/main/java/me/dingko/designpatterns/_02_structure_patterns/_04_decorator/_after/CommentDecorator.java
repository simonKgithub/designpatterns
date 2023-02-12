package me.dingko.designpatterns._02_structure_patterns._04_decorator._after;

public class CommentDecorator implements CommentService{
    private CommentService commentService;

    public CommentDecorator(CommentService commentService) {
        this.commentService = commentService;
    }

    @Override
    public void addComment(String comment) {
        this.commentService.addComment(comment);
    }
}
