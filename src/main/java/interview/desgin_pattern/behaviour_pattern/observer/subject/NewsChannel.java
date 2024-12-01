package deepak_lld_prep.behaviour_pattern.observer.subject;

import deepak_lld_prep.behaviour_pattern.observer.observer.Observer;

import java.util.ArrayList;
import java.util.List;

public class NewsChannel {
    private List<Observer> observers = new ArrayList<>();
    private String latestNews;

    // Subscribe to updates
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // Unsubscribe from updates
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // Notify all observers about the new update
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(latestNews);
        }
    }

    // Set new news and notify observers
    public void publishNews(String news) {
        this.latestNews = news;
        notifyObservers();
    }
}

