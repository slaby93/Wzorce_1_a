package com.company;

public class Fan {
    public OilPomp pompA;
    public OilPompController oilPompControllerA;
    public OilPomp pompB;
    public OilPompController oilPompControllerB;
    public BreakController fanBreakController;
    public Break fanBreak;
    int id;

    Fan(int id) {
        this.id = id;
        pompA = new OilPomp();
        oilPompControllerA = new OilPompController(pompA);
        pompB = new OilPomp();
        oilPompControllerB = new OilPompController(pompB);
        fanBreak = new Break();
        fanBreakController = new BreakController(fanBreak);
    }

    public void turnOnPower() {
        System.out.println("TURN ON POWER");
    }

    public void turnOffPower() {
        System.out.println("TURN OFF POWER");
    }

    public void turnOffSleepSomething() {
        System.out.println("Turn OFF Sleep power");
    }

    public void turnOnSleepSomething() {
        System.out.println("Turn ON Sleep power");
    }
}
