package com.company;

public class BreakController {
    Break breakToOperate;

    BreakController(Break breakToOperate) {
        this.breakToOperate = breakToOperate;
    }

    public void turnOff() {
        System.out.println("TURN OFF BREAK CONTROLLER");
        breakToOperate.turnOffBreak();
    }

    public void turnOn() {
        System.out.println("TURN ON BREAK CONTROLLER");
        breakToOperate.turnOnBreak();
    }
}
