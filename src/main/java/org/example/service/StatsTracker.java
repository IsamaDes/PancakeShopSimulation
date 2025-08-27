package org.example.service;

import org.example.model.RoundResult;

public class StatsTracker {
    private int totalMade;
    private int totalEaten;
    private int totalWasted;
    private int roundsRun;

    public void record(RoundResult result){
        totalMade = result.getPancakesMade();
        totalEaten = result.getPancakesEaten();
        totalWasted = result.getPancakesWasted();
        roundsRun++;
    }

    public void printSummary() {
        System.out.println("==== Simulation Summary ====");
        System.out.println("Rounds Run: " + roundsRun);
        System.out.println("Total Made: " + totalMade);
        System.out.println("Total Eaten: " + totalEaten);
        System.out.println("Total Wasted: " + totalWasted);
    }
}
