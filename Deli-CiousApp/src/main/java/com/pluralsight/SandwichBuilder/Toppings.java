package com.pluralsight.SandwichBuilder;

import java.util.ArrayList;

public class Toppings {

    //List of Regular Toppings
    private ArrayList <String> regularToppings = new ArrayList<>();
    private ArrayList <String> meats = new ArrayList<>();
    private ArrayList <String> cheeses = new ArrayList<>();
   private ArrayList <String> condiments = new ArrayList<>();
    private ArrayList <String> sides = new ArrayList<>();


    //Creating constructor to set up all of the array lists
    public Toppings() {
        regularToppings.add ("Lettuce");
        regularToppings.add ("Peppers");
        regularToppings.add ("Onions");
        regularToppings.add ("Tomatoes");
        regularToppings.add ("Jalepenos");
        regularToppings.add ("Cucumbers");
        regularToppings.add ("Pickles");
        regularToppings.add ("Guacamole");
        regularToppings.add ("Mushrooms");
        regularToppings.add("None");

        meats.add ("Steak");
        meats.add ("Ham");
        meats.add ("Salami");
        meats.add ("Roast Beef");
        meats.add ("Chicken");
        meats.add ("Bacon");
        meats.add("None");

        cheeses.add ("American");
        cheeses.add ("Provolone");
        cheeses.add ("Cheddar");
        cheeses.add ("Swiss");
        cheeses.add ("Muenster");
        cheeses.add ("Pepperjack");
        cheeses.add("None");

        condiments.add ("Mayo");
        condiments.add ("Mustard");
        condiments.add ("Ketchup");
        condiments.add ("Ranch");
        condiments.add ("Thousand Island");
        condiments.add ("Vinaigrette");
        condiments.add("None");

        //add side array
        sides.add("Au Ju");
        sides.add("Sauce");
        sides.add("None");
    }


    //getters


    public ArrayList<String> getMeats() {
        return meats;
    }

    public ArrayList<String> getCheeses(){
        return cheeses;
    }

    public ArrayList<String> getRegularToppings() {
        return regularToppings;
    }

    public ArrayList<String> getCondiments() {
        return condiments;
    }

    public ArrayList<String> getSides() {
        return sides;
    }

    public void addToppingMenu() {
        String regularTopping = regularToppings.get(0);

        switch (regularTopping) {
            case "Lettuce":
                System.out.println("Lettuce has been added.");
                break;
            case "Peppers":
                System.out.println("Peppers have been added.");
                break;
            case "Onions":
                System.out.println("Onions have been added.");
                break;
            case "Tomatoes":
                System.out.println("Tomatoes have been added");
                break;
            case "Jalapenos":
                System.out.println("Jalepenos have been added.");
                break;
            case "Cucumbers":
                System.out.println("Cucumbers have been added.");
                break;
            case "Pickles":
                System.out.println("Pickles have been added.");
                break;
            case "Guacamole":
                System.out.println("Guacamole has been added.");
                break;
            case "Mushrooms":
                System.out.println("Mushrooms have been added.");
                break;
    }
}


    //List of Meats
    public void addMeatsMenu() {
        String meat = meats.get(0);

        switch (meat) {
            case "Steak":
                System.out.println("Steak has been added.");
                break;
            case "Ham":
                System.out.println("Ham has been added.");
                break;
            case "Salami":
                System.out.println("Salami has been added.");
                break;
            case "Roast Beef":
                System.out.println("Roast Beef has been added");
                break;
            case "Chicken":
                System.out.println("Chicken has been added.");
                break;
            case "Bacon":
                System.out.println("Bacon has been added.");
                break;
    }
}





    //List of Cheeses
   public void addCheesesMenu() {
       String cheese = cheeses.get(0);

       switch (cheese) {
           case "American":
               System.out.println("American cheese has been added.");
               break;
           case "Provolone":
               System.out.println("Provolone cheese has been added.");
               break;
           case "Cheddar":
               System.out.println("Cheddar cheese has been added.");
               break;
           case "Swiss":
               System.out.println("Swiss cheese has been added");
               break;
           case "Muenster":
               System.out.println("Muenster cheese has been added.");
               break;
           case "Pepperjack":
               System.out.println("Pepperjack cheese has been added.");
               break;
    }
}





    //List of Condiments
   public void addCondimentsMenu() {
       String condiment = condiments.get(0);

       switch (condiment) {
           case "Mayo":
               System.out.println("Mayo has been added.");
               break;
           case "Mustard":
               System.out.println("Mustard has been added.");
               break;
           case "Ketchup":
               System.out.println("Ketchup has been added.");
               break;
           case "Ranch":
               System.out.println("Ranch has been added");
               break;
           case "Thousand Island":
               System.out.println("Thousand Island has been added.");
               break;
           case "Vinaigrette":
               System.out.println("Vinaigrette has been added.");
               break;


       }











    }




}



