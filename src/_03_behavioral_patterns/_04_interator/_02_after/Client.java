package _03_behavioral_patterns._04_interator._02_after;

import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        Board board = new Board();
        board.addPost("Post1");
        board.addPost("Post2");
        board.addPost("Post3");

        // TODO: Iterate (Posting order)
        Iterator<Post> defaultIterator = board.getDefaultIterator();
        while(defaultIterator.hasNext()){
            System.out.println(defaultIterator.next().getTitle());
        }

        // TODO: Iterate (Recent Posting)
        Iterator<Post> recentIterator = board.getRecentPostIterator();
        while(recentIterator.hasNext()){
            System.out.println(recentIterator.next().getTitle());
        }
    }

}
