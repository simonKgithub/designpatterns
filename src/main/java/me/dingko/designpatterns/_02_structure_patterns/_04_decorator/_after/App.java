package me.dingko.designpatterns._02_structure_patterns._04_decorator._after;

public class App {
    private static boolean enabledSpamFilter = true;
    private static boolean enabledTrimming = true;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentDecorator(commentService);
        }

        if (enabledTrimming) {
            commentService = new TrimmingCommentDecorator(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("관상");
        client.writeComment("누가 왕이 될 상인가...?");
        client.writeComment("광고 : https://blog.naver.com/dingko_");
    }
}
