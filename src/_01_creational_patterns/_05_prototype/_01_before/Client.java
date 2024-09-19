package _01_creational_patterns._05_prototype._01_before;

public class Client {

    public static void main(String[] args) {
        GithubRepository repository = new GithubRepository();
        repository.setUser("kevin");
        repository.setName("design-patterns");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("What is GoF design pattern?");

        String url = githubIssue.getUrl();
        System.out.println(url);
    }
}
