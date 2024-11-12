package com.pluralsight;

public class Drink extends MenuItem implements CalculatePrice {
    private String size;
    private String flavor;

    public Drink() {
    }

    public Drink(String size, String flavor) {
        this.size = size;
        this.flavor = flavor;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getFlavor() {
        return flavor;
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }
// add toString later
    @Override
    public double getPrice() {
        switch (this.size){
            case "S":
                return 2.00;

            case "M":
                return  2.50;

            case "L":
               return 3.00;
            default:
                System.out.println("Sorry, invalid entry. Please select from the size options above!");

        }


        return 0;
    }

    @Override
    public String toString() {
        return "Drink{" +
                "size='" + size + '\'' +
                ", flavor='" + flavor + '\'' +
                '}';
    }
}
