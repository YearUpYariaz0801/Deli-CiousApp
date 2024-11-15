package com.pluralsight.OtherOrderItems;

import com.pluralsight.BaseClasses.MenuItem;
import com.pluralsight.BaseClasses.Order;
import com.pluralsight.Utilities.CalculatePrice;

public class Drink extends MenuItem implements CalculatePrice {
   public String drinkSize;
    public String flavor;



    public Drink(String size, String flavor) {
        this.drinkSize = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return drinkSize;
    }

    public void setSize(String size) {
        this.drinkSize = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    @Override
    public double getPrice() {
        return switch (drinkSize) {
            case "S" -> 1.50;
            case "M" -> 2.00;
            case "L" -> 2.50;
            default -> 0;

           };

    }

      @Override
    public String toString() {
        return String.format("Drink: %s %s - $%.2f",
                drinkSize.toUpperCase(),
                flavor,
                getPrice());
    }
}
