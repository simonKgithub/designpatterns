package me.dingko.designpatterns._01_creational_patterns._05_prototype._after;

/**
 * 프로토타입 패턴: 기존 인스턴스를 복제하여 새로운 인스턴스를 만드는 방법
 *  - 복제 기능을 갖추고 있는 기존 인스턴스를 프로토타입으로 사용해 새 인스턴스를 만들 수 있다.
 *  - 기존 객체를 응용해서 새 객체를 만들 때 유용하게 사용
 *  - 기존 객체를 만들 때 시간이 많이 걸리는 작업에서 사용한다.
 *  - 기존에 있던 인스턴스를 프로토타입으로 쓰는 것이다.
 *
 *  - 자바에서 클론을 사용하는 구체적인 방법을 알아보자.
 */
public class App {
    public static void main(String[] args) throws CloneNotSupportedException {

        GithubRepository repository = new GithubRepository();
        repository.setUser("dingko");
        repository.setName("design-pattern");

        GithubIssue githubIssue = new GithubIssue(repository);
        githubIssue.setId(1);
        githubIssue.setTitle("1회차, 프로토타입 패턴에 대해서 알아보자.");


        /**
         * clone() 메서드는 Object 안에 들어있다.
         * clone() 은 protected 이기 때문에, 명시적으로 clone() 이 가능하도록 만들어주어야 한다.
         *  - how?
         *      1) clone()을 지원하고자 하는 클래스에 Cloneable 을 구현한다.
         *      2) 구현한 클래스에서 clone() 이라는 클래스를 오버라이딩 한다. (object 가 제공해주는 기본적인 clone() 기능읗 사용하면 된다.)
         *      3) 사용하는 클래스에 CloneNotSupportedException 예외를 선언한다.
         *      4) clone.equals(origin): true 가 나오려면, 구현 클래스에서 equals 를 재정의해줘야 한다.
         * 기본적으로 자바가 제공하는 clone()은 얉은 복사이다. clone 이나 origin 의 변경이 서로에게 영향이 간다.
         */
        GithubIssue clone = (GithubIssue) githubIssue.clone();

        System.out.println("clone.getUrl() = " + clone.getUrl());

        String url = githubIssue.getUrl();
        System.out.println("url = " + url);

        repository.setUser("simon"); // 얉은 복사, 깊은 복사 차이를 주기위한 세팅

        System.out.println("=========================================");
        System.out.println("githubIssue != clone: " + (githubIssue != clone));
        System.out.println("githubIssue.getClass() == clone.getClass(): " + (githubIssue.getClass() == clone.getClass()));
        System.out.println("clone.equals(githubIssue): " + (clone.equals(githubIssue)));
        System.out.println("=========================================");
        // 자바가 제공하는 clone()은 얉은 복사이다. 기본적으로 clone 과 origin 이 가리키는 repository 는 같다.
        System.out.println("clone.getRepository() == githubIssue.getRepository(): " + (clone.getRepository() == githubIssue.getRepository()));
        // 참조하고있는 GithubRepository 가 동일하기 때문에 repository 가 변경되면 clone 과 origin 둘 다 영향을 받는다.
        // 같은 repository 를 참조하고 싶지 않다면, 오버라이딩 한 clone() 메서드를 수정하면 된다.
        // 새로 GithubRepository 를 생성하여 값을 넣은 후 반환하면 된다.
        System.out.println("clone.getUrl() = " + clone.getUrl());
        System.out.println("githubIssue.getUrl() = " + githubIssue.getUrl());
    }
}
