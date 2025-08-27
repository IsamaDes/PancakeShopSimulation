package org.example.ui;

import org.example.model.RoundResult;
import org.example.service.SimulationEngine;
import org.example.service.StatsTracker;

import java.util.Scanner;

public class ConsoleUI {
    private final SimulationEngine engine;
    private final StatsTracker stats = new StatsTracker();

    public ConsoleUI(SimulationEngine engine) {
        this.engine = engine;
    }

    public void start() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rounds to simulate: ");
        int rounds = scanner.nextInt();

        for (int i = 0; i < rounds; i++) {
            RoundResult result = engine.runRound();
            stats.record(result);

            System.out.println("\n--- Round " + (i + 1) + " ---");
            System.out.println("Pancakes Made: " + result.getPancakesMade());
            System.out.println("Pancakes Eaten: " + result.getPancakesEaten());
            System.out.println("Pancakes Wasted: " + result.getPancakesWasted());
            System.out.println("Needs Met: " + result.isNoWaste());
        }

        stats.printSummary();
    }
}
