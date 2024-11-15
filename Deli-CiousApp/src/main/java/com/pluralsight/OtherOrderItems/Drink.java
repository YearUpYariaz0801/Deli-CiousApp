package com.pluralsight.OtherOrderItems;

import com.pluralsight.BaseClasses.MenuItem;
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
// add toString later

    public static double getPriceForDrinkSize(String size) {
        double price = switch (size) {
            case "small" -> 1.50;
            case "medium" -> 2.00;
            case "large" -> 2.50;
            default -> -1; //\ Invalid size } return price;

//                // Handle any other cases, if needed
//                throw new IllegalArgumentException("Invalid drink size: " + this.drinkSize);
        };

         System.out.println("Sorry, invalid entry. Please select from the size options above!");
        return price;
    }





    public String calculateTotalCost(Drink drink) {
        return drinkSize;
    }

    @Override
    public String toString() {
        return "Drink" +
                ", size =" + drinkSize + '\'' +
                ", flavor='" + flavor + '\''
                ;
    }
}
