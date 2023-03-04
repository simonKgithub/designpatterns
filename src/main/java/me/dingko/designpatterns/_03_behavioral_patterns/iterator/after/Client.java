package me.dingko.designpatterns._03_behavioral_patterns.iterator.after;

import me.dingko.designpatterns._03_behavioral_patterns.iterator.Board;
import me.dingko.designpatterns._03_behavioral_patterns.iterator.Post;

import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("디자인 패턴");
        for (int i = 0; i < 10000; i++) {
            System.out.print("-");
        }
        System.out.println();
        board.addPost("이러테이터 패턴 학습");
        for (int i = 0; i < 10000; i++) {
            System.out.print("-");
        }
        System.out.println();
        board.addPost("이터레이터 패턴은 자바 사용자가 흔히 접할 수 있는 패턴 중 하나이다.");

        //들어간 순서대로 순회하기
//        Iterator<Post> iterator = board.getPosts().iterator();
        Iterator<Post> iterator = board.getDefaultIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getTitle());
        }

        //가장 최신 글 먼저 순회하기
        Iterator<Post> recentPostIterator = board.getRecentPostIterator();
        while (recentPostIterator.hasNext()) {
            System.out.println(recentPostIterator.next().getTitle());
        }
    }
}