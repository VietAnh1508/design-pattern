package com.designpattern.singleton;

public class SingletonLazyMultithreaded {

    private static SingletonLazyMultithreaded instance = null;

    private SingletonLazyMultithreaded() { }

    public static synchronized SingletonLazyMultithreaded getInstance() {
        if (instance == null) {
            instance = new SingletonLazyMultithreaded();
        }
        return instance;
    }

}
