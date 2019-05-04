package com.designpattern.observer;

import java.util.List;

public class CommentaryObject implements Subject, Commentary {

    private final List<Observer> observers;

    private String desc;

    private final String subscribeDetails;

    CommentaryObject(List<Observer> observers, String subscribeDetails) {
        this.observers = observers;
        this.subscribeDetails = subscribeDetails;
    }

    @Override
    public void subscribeObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unSubscribeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println();
        for (Observer observer : observers) {
            observer.update(desc);
        }
    }

    @Override
    public String subjectDetails() {
        return subscribeDetails;
    }

    @Override
    public void setDesc(String desc) {
        this.desc = desc;
        notifyObservers();
    }

}
