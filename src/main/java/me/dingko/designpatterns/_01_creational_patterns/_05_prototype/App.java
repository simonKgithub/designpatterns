package me.dingko.designpatterns._01_creational_patterns._05_prototype;

public class App {
    public static void main(String[] args) throws CloneNotSupportedException {
        GithubRepository repository = new GithubRepository();
        repository.setUser("Whiteship");
        repository.setName("live-study");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1주차 과제 : JVM은 무엇이며 자바 코드는 어떻게 실행되는가?");

        String url = githubIssue.getUrl();
        System.out.println(url);

        GithubIssue clone = (GithubIssue) githubIssue.clone();
        System.out.println(clone.getUrl());

        repository.setUser("dingko_");

        //내용 확인
        System.out.println(clone != githubIssue); //true
        System.out.println(clone.equals(githubIssue)); //true
        System.out.println(clone.getClass() == githubIssue.getClass()); //true
        System.out.println(clone.getRepository() == githubIssue.getRepository()); //true

        System.out.println(clone.getUrl());
    }
}

