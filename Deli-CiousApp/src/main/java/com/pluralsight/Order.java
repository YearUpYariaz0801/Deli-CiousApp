package com.pluralsight;

import java.util.ArrayList;

public class Order implements CalculatePrice {
    private int orderNo;
    private ArrayList<Sandwich> sandwiches;

    private ArrayList<Chips> chips;
    private ArrayList<Drink> drinks;

    private ArrayList<MenuItem> items;

    //constructors - getters - setters - to string hand

    private static int nextOrderNumber = 1;
    public Order() {
        this.orderNo = nextOrderNumber++;
        this.sandwiches = new ArrayList<>();
        this.chips = new ArrayList<>();
        this.drinks = new ArrayList<>();
        this.items = new ArrayList<>();
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

    public void addSandwich(Sandwich sandwich){
        this.sandwiches.add(sandwich);
    }

    public ArrayList<Chips> getChips() {
        return chips;
    }

    public void setChips(ArrayList<Chips> chips) {
        this.chips = chips;
    }

    public ArrayList<Drink> getDrinks() {
        return drinks;
    }

    public void setDrinks(ArrayList<Drink> drinks) {
        this.drinks = drinks;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }
    public void addItemToOrder(MenuItem item){
        this.items.add(item);
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", sandwiches=" + sandwiches +
                ", chips='" + chips + '\'' +
                ", drink=" + drinks +
                '}';
    }

    @Override
    public double getPrice() {
        double total = 0;

        for(MenuItem item: items){
            total += item.getPrice();
        }



        return total;
    }
}
