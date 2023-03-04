package me.dingko.designpatterns._03_behavioral_patterns.iterator.after;

import me.dingko.designpatterns._03_behavioral_patterns.iterator.Board;
import me.dingko.designpatterns._03_behavioral_patterns.iterator.Post;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class RecentPostIterator implements Iterator<Post> {
    private Iterator<Post> internalIterator;
    private Board board;

    public RecentPostIterator(List<Post> posts) {
        Collections.sort(posts, (p1, p2) -> p2.getCreatedDateTime().compareTo(p1.getCreatedDateTime()));
//        List<Post> clone = List.copyOf(posts);
        this.internalIterator = posts.iterator();
    }

    @Override
    public boolean hasNext() {
        return this.internalIterator.hasNext();
    }

    @Override
    public Post next() {
        return this.internalIterator.next();
    }
}
