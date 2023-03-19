package com.designpattern.state;

public class Robot implements RoboticState {

    private RoboticState roboticOn;
    private RoboticState roboticOff;
    private RoboticState roboticCook;
    private RoboticState roboticStandby;

    private RoboticState state;

    public Robot() {
        this.roboticOn = new RoboticOn(this);
        this.roboticOff = new RoboticOff(this);
        this.roboticCook = new RoboticCook(this);
        this.roboticStandby = new RoboticStandby(this);

        this.state = roboticOn;
    }

    @Override
    public void walk() {
        state.walk();
        setState(roboticStandby);
    }

    @Override
    public void cook() {
        state.cook();
        setState(roboticStandby);
    }

    @Override
    public void off() {
        state.off();
    }

    public RoboticState getRoboticOn() {
        return roboticOn;
    }

    public void setRoboticOn(RoboticState roboticOn) {
        this.roboticOn = roboticOn;
    }

    public RoboticState getRoboticCook() {
        return roboticCook;
    }

    public void setRoboticCook(RoboticState roboticCook) {
        this.roboticCook = roboticCook;
    }

    public RoboticState getRoboticOff() {
        return roboticOff;
    }

    public void setRoboticOff(RoboticState roboticOff) {
        this.roboticOff = roboticOff;
    }

    public RoboticState getState() {
        return state;
    }

    public void setState(RoboticState state) {
        this.state = state;
    }

    public RoboticState getRoboticStandby() {
        return roboticStandby;
    }

    public void setRoboticStandby(RoboticState roboticStandby) {
        this.roboticStandby = roboticStandby;
    }

}
