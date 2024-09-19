package _02_structural_patterns._04_decorator._01_before;

public class Client {
    private CommentService commentService;

    public Client(CommentService commentService) {
        this.commentService = commentService;
    }

    private void writeComment(String comment) {
        commentService.addComment(comment);
    }

    public static void main(String[] args) {
//        Client client = new Client(new TrimmingCommentService());
        Client client = new Client(new SpamFilteringCommentService());
        client.writeComment("Squid Game");
        client.writeComment("Great Movie...");
        client.writeComment("http://google.com");
    }
}
