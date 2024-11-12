package com.pluralsight;

import java.util.ArrayList;

public class Sandwich implements CalculatePrice{
    private int size;
    private String bread;
    private ArrayList<String> regularToppings;

    //this should be probably be reformatted so that all of the toppings are in 1 array..
    // or these 2 arrays are combined to be "premium toppings"
    private ArrayList<String> meats;
    private ArrayList<String> cheeses;
    private boolean toasted;

    private ArrayList<String> condiments;

    private ArrayList<String> sides;

    public Sandwich() {
    }

    public Sandwich(int size, String bread, ArrayList<String> regularToppings, ArrayList<String> meats, ArrayList<String> cheeses, boolean toasted, ArrayList<String> condiments, ArrayList <String> sides) {
        this.size = size;
        this.bread = bread;
        this.regularToppings = regularToppings;
        this.meats = meats;
        this.cheeses = cheeses;
        this.toasted = toasted;
        this.condiments = condiments;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getBread() {
        return bread;
    }

    public void setBread(String bread) {
        this.bread = bread;
    }

    public ArrayList<String> getRegularToppings() {
        return regularToppings;
    }

    public void setRegularToppings(ArrayList<String> regularToppings) {
        this.regularToppings = regularToppings;
    }

    public ArrayList<String> getMeats() {
        return meats;
    }

    public void setMeats(ArrayList<String> meats) {
        this.meats = meats;
    }

    public ArrayList<String> getCheeses() {
        return cheeses;
    }

    public void setCheeses(ArrayList<String> cheeses) {
        this.cheeses = cheeses;
    }

    public boolean isToasted() {
        return toasted;
    }

    public void setToasted(boolean toasted) {
        this.toasted = toasted;
    }

    public ArrayList<String> getCondiments() {
        return condiments;
    }

    public void setSauces(ArrayList<String> condiments) {
        this.condiments = condiments;
    }

    public ArrayList<String> getSides() {
        return sides;
    }

    public void setSides(ArrayList<String> sides) {
        this.sides = sides;
    }

    @Override
    public String toString() {
        return "Sandwich{" +
                "size=" + size +
                ", bread='" + bread + '\'' +
                ", regularToppings=" + regularToppings +
                ", meats=" + meats +
                ", cheeses=" + cheeses +
                ", toasted=" + toasted +
                ", condiments=" + condiments +
                ", sides=" + sides +
                '}';
    }

    @Override
    public double getPrice() {
        return 0;
    }

}
