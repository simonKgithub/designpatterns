package me.dingko.designpatterns._01_creational_patterns._05_prototype._after;

import java.util.Objects;

public class GithubIssue implements Cloneable{
    private int id;
    private String title;
    private GithubRepository repository;

    public GithubIssue(GithubRepository repository) {
        this.repository = repository;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public GithubRepository getRepository() {
        return repository;
    }

    public void setRepository(GithubRepository repository) {
        this.repository = repository;
    }

    public String getUrl(){
        return String.format("https://github.com/%s/%s/issue/%d,",
                repository.getUser(),
                repository.getName(),
                this.id
        );
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
//        return super.clone(); // 얉은 복사
        // 깊은 복사
        GithubRepository newRepository = new GithubRepository();
        newRepository.setName(this.repository.getName());
        newRepository.setUser(this.repository.getUser());

        GithubIssue newGithubIssue = new GithubIssue(newRepository);
        newGithubIssue.setId(this.id);
        newGithubIssue.setTitle(this.title);

        return newGithubIssue;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GithubIssue that = (GithubIssue) o;
        return id == that.id && Objects.equals(title, that.title) && Objects.equals(repository, that.repository);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, repository);
    }
}
