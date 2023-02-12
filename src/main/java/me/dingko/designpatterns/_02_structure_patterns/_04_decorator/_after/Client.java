package me.dingko.designpatterns._02_structure_patterns._04_decorator._after;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    public void writeComment(String comment) {
        this.commentService.addComment(comment);
    }
}
