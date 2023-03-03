package me.dingko.designpatterns._03_behavioral_patterns.iterator;

import me.dingko.designpatterns._03_behavioral_patterns.iterator.after.RecentPostIterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Board {
    private List<Post> posts = new ArrayList<>();

    public List<Post> getPosts() {
        return posts;
    }

    public void addPost(String content) {
        this.posts.add(new Post(content));
    }

    public Iterator<Post> getDefaultIterator(){
        return posts.iterator();
    }

    public Iterator<Post> getRecentPostIterator(){
        return new RecentPostIterator(posts);
    }
}
