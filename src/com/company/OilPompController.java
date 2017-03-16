package com.company;

/**
 * Created by Slaby on 16.03.2017.
 */
public class OilPompController {
    OilPomp pomp;

    OilPompController(OilPomp pomp) {
        this.pomp = pomp;
    }

    public void turnOn() {
        System.out.println("TURN ON POMP");
        pomp.turnMeOn();
    }

    public void turnOff() {
        System.out.println("TURN OFF POMP");
        pomp.turnMeOff();
    }
}
