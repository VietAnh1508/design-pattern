package com.designpattern.singleton;

public class SingletonLazyDoubleCheck {

    private static SingletonLazyDoubleCheck instance = null;

    private SingletonLazyDoubleCheck() { }

    public static SingletonLazyDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonLazyDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonLazyDoubleCheck();
                }
            }
        }
        return instance;
    }

}
