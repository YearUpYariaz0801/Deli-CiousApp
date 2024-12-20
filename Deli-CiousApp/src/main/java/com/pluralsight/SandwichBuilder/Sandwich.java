package com.pluralsight.SandwichBuilder;

import com.pluralsight.BaseClasses.MenuItem;
import com.pluralsight.Utilities.CalculatePrice;

import java.util.ArrayList;

public class Sandwich extends MenuItem implements CalculatePrice {
    public int size;
    public String bread;
    //Regular Toppings Array List
    public ArrayList<String> regularToppings;

    //Premium Toppings array Lists separated by type
    public ArrayList<String> meats;
    public ArrayList<String> cheeses;
    public boolean toasted;

    public ArrayList<String> condiments;

    public ArrayList<String> sides;

    public Sandwich() {
        this.toasted = false;
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

    public void setCondiments(ArrayList<String> condiments) {
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
        double price =0;

        switch(this.size){

            case 4:
                price += 5.50;

                //add meats
               if(!meats.isEmpty()){
                   if(meats.size() >= 1){
                       price+=1;

                       for(int i = meats.size()-1; i > 0; --i){
                           price += .50;
                       }
                   }
               }

                //add cheese
                if(!cheeses.isEmpty()){

                    if(cheeses.size() >= 1){
                        price+= .75;

                        for(int i = cheeses.size()-1; i > 0; --i){
                            price += .30;
                        }
                    }
                }

break;
            case 8:
                price += 7;

                //add meats
                if(!meats.isEmpty()){
                    if(meats.size() >= 1){
                        price+= 2;

                        for(int i = meats.size()-1; i > 0; --i){
                            price += 1;
                        }
                    }
                }

                //add cheese
                if(!cheeses.isEmpty()){

                    if(cheeses.size() >= 1){
                        price+= 1.50;

                        for(int i = cheeses.size()-1; i > 0; --i){
                            price += .60;
                        }
                    }
                }



break;
            case 12:
                price += 8.50;

                //add meats
                if(!meats.isEmpty()){
                    if(meats.size() >= 1){
                        price+=3;

                        for(int i = meats.size()-1; i > 0; --i){
                            price += 1.50;
                        }
                    }
                }

                //add cheese
                if(!cheeses.isEmpty()){

                    if(cheeses.size() >= 1){
                        price+= 2.25;

                        for(int i = cheeses.size()-1; i > 0; --i){
                            price += .90;
                        }
                    }
                }


                break;
        }



        return price;
    }

    public double calculateTotalCost(Sandwich Sandwich) {
        return 0;
    }


}
