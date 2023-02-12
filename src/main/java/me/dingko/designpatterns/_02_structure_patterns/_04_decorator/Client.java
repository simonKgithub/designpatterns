package me.dingko.designpatterns._02_structure_patterns._04_decorator;

public class Client {
    private CommentService commentService; //댓글을 남기는 서비스

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("관상");
        client.writeComment("누가 왕이 될 상인가...?");
        client.writeComment("https://blog.naver.com/dingko_"); //광고용
    }
}