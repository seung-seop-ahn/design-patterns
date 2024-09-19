package _02_structural_patterns._04_decorator._02_after;

public class App {

    private static boolean enabledSpamFilter = true;

    private static boolean enabledTrimming = false;

    public static void main(String[] args) {
        CommentService commentService = new DefaultCommentService();

        if (enabledSpamFilter) {
            commentService = new SpamFilteringCommentService(commentService);
        }
        if (enabledTrimming) {
            commentService = new TrimmingCommentService(commentService);
        }

        Client client = new Client(commentService);
        client.writeComment("Squid Game");
        client.writeComment("Great Movie...");
        client.writeComment("http://google.com");
    }
}
