package me.dingko.designpatterns._03_behavioral_patterns.iterator;

import java.util.Collections;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴");
        board.addPost("이러테이터 패턴 학습");
        board.addPost("이터레이터 패턴은 자바 사용자가 흔히 접할 수 있는 패턴 중 하나이다.");

        //들어간 순서대로 순회하기
        List<Post> posts = board.getPosts();
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

        //가장 최신 클 먼저 순회하기
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
        for (int i = 0; i < posts.size(); i++) {
            Post post = posts.get(i);
            System.out.println(post.getTitle());
        }

    }
}
