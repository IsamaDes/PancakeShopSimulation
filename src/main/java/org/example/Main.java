package org.example;

import org.example.service.SimulationEngine;
import org.example.ui.ConsoleUI;

public class Main {
    public static void main(String[] args) {
        SimulationEngine engine = new SimulationEngine();
        ConsoleUI ui = new ConsoleUI(engine);
        ui.start();
    }
}