package com.company;

import java.util.ArrayList;
import java.util.List;

public class FanFacade {

    List<Fan> fans;

    FanFacade() {
        fans = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            fans.add(new Fan(i));
        }
    }

    public void turnOnFan(int id) {
        System.out.println("-------START------------");
        Fan fanToOperator = fans.get(id);

        if (fanToOperator == null) {
            System.out.println("[ERROR] Fan not found: " + id);
            return;
        }

        // turn on pomps
        fanToOperator.oilPompControllerA.turnOn();
        fanToOperator.oilPompControllerB.turnOn();
        // turn off break
        fanToOperator.fanBreakController.turnOff();
        // turn on power
        fanToOperator.turnOnPower();
        // turn off sometingf
        fanToOperator.turnOffSleepSomething();

        System.out.println("-------END------------");
    }

    public void turnOffFan(int id) {
        System.out.println("-------START------------");

        Fan fanToOperator = fans.get(id);

        if (fanToOperator == null) {
            System.out.println("[ERROR] Fan not found: " + id);
            return;
        }
        // turn ON Sleep something
        fanToOperator.turnOnSleepSomething();
        //        // turn OFF power
        fanToOperator.turnOffPower();
        //        // turn ON break
        fanToOperator.fanBreakController.turnOn();
//        // turn on pomps
        fanToOperator.oilPompControllerA.turnOff();
        fanToOperator.oilPompControllerB.turnOff();
        System.out.println("-------END------------");

    }
}
