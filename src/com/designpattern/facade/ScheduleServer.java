package com.designpattern.facade;

public class ScheduleServer {

    public void startBooting() {
        System.out.println("Start booting");
    }

    public void readSystemConfigFile() {
        System.out.println("Read system config file");
    }

    public void init() {
        System.out.println("Init");
    }

    public void initializeContext() {
        System.out.println("Initialize context");
    }

    public void initializeListeners() {
        System.out.println("Initialize listeners");
    }

    public void createSystemObjects() {
        System.out.println("Create system objects");
    }

    public void releaseProcesses() {
        System.out.println("Release processes");
    }

    public void destory() {
        System.out.println("Destroy");
    }

    public void destroySystemObjects() {
        System.out.println("Destroy system objects");
    }

    public void destoryListeners() {
        System.out.println("Destroy listeners");
    }

    public void destoryContext() {
        System.out.println("Destroy context");
    }

    public void shutdown() {
        System.out.println("Shutdown");
    }

}
