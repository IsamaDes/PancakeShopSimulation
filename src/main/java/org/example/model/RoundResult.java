package org.example.model;

public class RoundResult {
    private int pancakesMade;
    private int pancakesEaten;
    private int pancakesWasted;
    private boolean noWaste;


    public RoundResult(int pancakesMade, int pancakesEaten, int pancakesWasted, boolean needsMet){
        this.pancakesMade = pancakesMade;
        this.pancakesEaten = pancakesEaten;
        this.pancakesWasted = pancakesWasted;
        this.noWaste = noWaste;
    }

   public int getPancakesMade(){
        return  pancakesMade;
   }
   public int getPancakesEaten(){
        return pancakesEaten;
   }
   public int getPancakesWasted(){
        return pancakesWasted;
   }
   public boolean isNoWaste(){
        return noWaste;
   }

}
