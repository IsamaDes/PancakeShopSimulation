package org.example.model;

public class Order {
    private String userName;
    private int requested;
    private int served;


    public Order(String userName, int requested) {
        this.userName = userName;
        this.requested = requested;
        this.served = 0;
    }

    public String getCustomer() {
        return userName;
    }

    public int getRequested() {
        return requested;
    }

    public int getServed() {
        return served;
    }

    public void serve(int pancakes) {
        served += pancakes;
    }

}