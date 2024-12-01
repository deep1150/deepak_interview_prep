package deepak_lld_prep.behaviour_pattern.observer.client;

import deepak_lld_prep.behaviour_pattern.observer.concrete.User;
import deepak_lld_prep.behaviour_pattern.observer.observer.Observer;
import  deepak_lld_prep.behaviour_pattern.observer.subject.NewsChannel;

public class ObserverExample {
    public static void main(String[] args) {
        NewsChannel newsChannel = new NewsChannel();

        Observer user1 = new User("Alice");
        Observer user2 = new User("Bob");

        // Subscribe users to the news channel
        newsChannel.subscribe(user1);
        newsChannel.subscribe(user2);

        // Publish news
        newsChannel.publishNews("Breaking News: Design Patterns are awesome!");

        // Unsubscribe a user and publish more news
        newsChannel.unsubscribe(user1);
        newsChannel.publishNews("Latest Update: Observer Pattern explained!");
    }
}

