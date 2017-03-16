package com.company;

public class Main {

    public static void main(String[] args) {
        FanFacade fanFacade = new FanFacade();
        simulateClient(fanFacade);
    }

    public static void simulateClient(FanFacade fanFacade) {

        fanFacade.turnOnFan(0);
        fanFacade.turnOffFan(0);
//        fanFacade.fans.get(0).
    }
}
