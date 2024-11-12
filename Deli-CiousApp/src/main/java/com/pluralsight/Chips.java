package com.pluralsight;

public class Chips extends MenuItem implements CalculatePrice {
    public  double  price = 1.50;

    public String getChip() {
        return chip;
    }

    public void setChip(String chip) {
        this.chip = chip;
    }

    private String chip;

    public Chips(String chip) {
        this.chip = chip;
    }


    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Chips{" +
                "price=" + price +
                ", chip='" + chip + '\'' +
                '}';
    }
}
