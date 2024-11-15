package com.pluralsight.BaseClasses;

import com.pluralsight.Utilities.CalculatePrice;
import com.pluralsight.OtherOrderItems.Chips;
import com.pluralsight.OtherOrderItems.Drink;
import com.pluralsight.SandwichBuilder.Sandwich;

import java.util.ArrayList;

public class Order implements CalculatePrice {
    public int orderNo;
   public ArrayList<Sandwich> sandwiches;

    public ArrayList<Chips> chips;
    public ArrayList<Drink> drinks;

    public ArrayList<MenuItem> items;

    //constructors - getters - setters - to string hand

    public static int nextOrderNumber = 1;
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

    // Method to calculate the total price of the order
    public double calculateTotal() {
        totalPrice = 0;
        for (MenuItem item : items) {
            if (item instanceof Sandwich) {
                Sandwich sandwich = (Sandwich) item;
                totalPrice += sandwich.calculateTotalCost();
            } else {
                totalPrice += item.calculatePrice();
            }
        }
        return totalPrice;
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

}

}

