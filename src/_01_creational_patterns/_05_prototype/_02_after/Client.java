package _01_creational_patterns._05_prototype._02_after;

public class Client {

    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("kevin");
        repository.setName("design-patterns");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("What is GoF design pattern?");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());
        System.out.println(clone != githubIssue); // true
        System.out.println(clone.equals(githubIssue)); // true
        System.out.println(clone.getClass() == githubIssue.getClass()); // true

        // Shallow Copy (Java Default Copy)
        // Cloned object references are same
        System.out.println(clone.getRepository() == githubIssue.getRepository()); // true
    }
}
