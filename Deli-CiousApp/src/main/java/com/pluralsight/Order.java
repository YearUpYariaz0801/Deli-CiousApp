package com.pluralsight;

import java.util.ArrayList;

public class Order {
    private int orderNo;
    private ArrayList<Sandwich> sandwiches;

    private String chips;
    private Drink drink;

    //constructors - getters - setters - to string hand


    public Order(int orderNo, ArrayList<Sandwich> sandwiches, String chips, Drink drink) {
        this.orderNo = orderNo;
        this.sandwiches = sandwiches;
        this.chips = chips;
        this.drink = drink;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public ArrayList<Sandwich> getSandwiches() {
        return sandwiches;
    }

    public void setSandwiches(ArrayList<Sandwich> sandwiches) {
        this.sandwiches = sandwiches;
    }

    public String getChips() {
        return chips;
    }

    public void setChips(String chips) {
        this.chips = chips;
    }

    public Drink getDrink() {
        return drink;
    }

    public void setDrink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", sandwiches=" + sandwiches +
                ", chips='" + chips + '\'' +
                ", drink=" + drink +
                '}';
    }
}
