package org.example.service;

import org.example.model.Customer;
import org.example.model.RoundResult;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class SimulationEngine {
    private static final int Max_Pancakes_Per_Batch = 12;
    private static final int Max_Pancakes_PerUser = 5;
    private static final int Max_Users = 3;

   public final Random random = new Random();

   public RoundResult runRound(){
       int pancakesMade = random.nextInt(Max_Pancakes_Per_Batch + 1);
       int pancakesEaten = 0;
       int pancakesWasted = 0;

       //create the customer and give him and id and the highest pancake he can order;
       List<Customer> customers = new ArrayList<>();
       for(int i = 0; i < Max_Users; i++){
           int customerId = i + 1;
           int pancakesLimit = Max_Pancakes_PerUser;

           Customer customer = new Customer(customerId, pancakesLimit);
           customers.add(customer);
       }

     int remainingPancakes = pancakesMade;
       for(Customer customer: customers){
           int orderSize = random.nextInt(customer.getMaxOrder() + 1);
           int served = Math.min(orderSize, remainingPancakes);
           remainingPancakes -= served;
           pancakesEaten += served;
       }

     pancakesWasted = remainingPancakes;
       boolean noWaste = (pancakesWasted == 0);

       if (noWaste) {
           System.out.println("Great! The shop used up all pancakes with no waste.");
       } else {
           System.out.println("There are " + pancakesWasted + " pancakes left over.");
       }

       return new RoundResult(pancakesMade, pancakesEaten, pancakesWasted, noWaste);
   }


}
