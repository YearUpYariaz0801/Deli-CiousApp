package com.pluralsight.BaseClasses;

import com.pluralsight.Utilities.CalculatePrice;

public abstract class MenuItem implements CalculatePrice {


    @Override
    public abstract double getPrice();


    // you can add in logic as you so please
}
