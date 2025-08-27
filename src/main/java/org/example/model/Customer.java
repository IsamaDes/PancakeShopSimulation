package org.example.model;

public class Customer {
    private final int id;
    private final int maxOrder;

    public Customer(int id, int maxOrder){
        this.id = id;
        this.maxOrder = maxOrder;
    }
   public int getId(){
        return id;
   }
   public int getMaxOrder(){
        return maxOrder;
   }
}
