package deepak_lld_prep.behaviour_pattern.observer.concrete;


import deepak_lld_prep.behaviour_pattern.observer.observer.Observer;

public class User implements Observer {
    private String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public void update(String news) {
        System.out.println(name + " received news update: " + news);
    }
}

