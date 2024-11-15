package com.pluralsight.BaseClasses;

import com.pluralsight.Utilities.CalculatePrice;

public abstract class MenuItem implements CalculatePrice {


    @Override
    public double getPrice() {
        return 0;
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    // you can add in logic as you so please
}
