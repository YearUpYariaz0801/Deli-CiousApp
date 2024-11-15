package com.pluralsight.Utilities;
import com.pluralsight.BaseClasses.MenuItem;
import com.pluralsight.BaseClasses.Order;
import com.pluralsight.OtherOrderItems.Chips;
import com.pluralsight.OtherOrderItems.Drink;
import com.pluralsight.SandwichBuilder.Sandwich;
import com.pluralsight.SandwichBuilder.Toppings;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    public static final Scanner scanner = new Scanner(System.in);
    public static List<String> orderItems = new ArrayList<String>();
    public static Toppings allToppings = new Toppings();

   public static Order order;
    public static void main(String[] args) {
        boolean running = true;

        //Home Screen loops until the customer chooses to exit the app.
        while (running) {
            System.out.println("Welcome to DELI-cious Sandwich Shop!!!");
            System.out.println("Home Screen");
            System.out.println("1) New Order");
            System.out.println("0) Exit");

            int choice = getChoice();

            switch (choice) {
                case 1 -> startNewOrder();
                case 0 -> running = false;
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
        System.out.println("Thank you for visiting!");
    }

    public static void startNewOrder() {
        order = new Order();

       // orderItems.clear();
        boolean ordering = true;

        //Allows the customers to add items to their order and check out or
        //Cancel the order, exit the order screen and clears the in progress order
        while (ordering) {
            System.out.println("\nOrder Screen");
            System.out.println("1) Add Sandwich");
            System.out.println("2) Add Drink");
            System.out.println("3) Add Chips");
            System.out.println("4) Checkout");
            System.out.println("0) Cancel Order");

            int choice = Console.PromptForInt();

            switch (choice) {
                case 1 -> addSandwich();
                case 2 -> addDrink();
                case 3 -> addChips();
                case 4 -> checkout();
                case 0 -> {
                    System.out.println("Order canceled.");
                    ordering = false;
                }
                default -> System.out.println("Invalid choice, please try again.");
            }
        }
    }

    //Collects customer input and adds it to order items
    //want this to call from sandwich class and write to order class
    public static void addSandwich() {
        System.out.println("\nAdding Sandwich:");
        Sandwich s = new Sandwich();

        System.out.print("Select your bread (White/Wheat/Rye/Wrap): ");
        String bread = Console.PromptForString();
        s.setBread(bread);

        int size = Console.PromptForInt("Sandwich size (4/8/12): ");
        s.setSize(size);

        //how to make s look like the sandwich described above..

        System.out.print("Meat Menu ");
        displayMeatMenu();
        String meatSelection = Console.PromptForString();
        String[] selections = meatSelection.split(",");

        //helper method to go through choices and add it to Sandwich class meatArr
      // ArrayList<String> meatToppingsArr = getMeatsFromUserToAddToSandwich(selections);

        s.setMeats(getMeatsFromUserToAddToSandwich(selections));
        System.out.println("Meats have been added to your sandwich");
//================================Add cheese===========================================//
        System.out.print("Cheese Menu ");
        displayCheeseMenu();
        String cheeseSelection = Console.PromptForString();
        selections = cheeseSelection.split(",");

        //helper method to go through choices and add it to Sandwich class cheeseArr
        // ArrayList<String> cheeseToppingsArr = getCheesesFromUserToAddToSandwich(selections);

        s.setCheeses(getCheesesFromUserToAddToSandwich(selections));
        System.out.println("Cheeses have been added to your sandwich");
//================================Add Regular Toppings===========================================//
        System.out.print("Regular Toppings Menu ");
        displayRegularToppingsMenu();
        String regularToppingsSelection = Console.PromptForString();
        selections = regularToppingsSelection.split(",");

        //helper method to go through choices and add it to Sandwich class cheeseArr

        s.setRegularToppings(getRegularToppingsFromUserToAddToSandwich(selections));
        System.out.println("Your chosen regular toppings have been added to your sandwich");
//================================Add Condiments===========================================//
        //
        System.out.print("Condiments Menu ");
        displayCondimentMenu();
        String condimentSelection = Console.PromptForString();
        selections = condimentSelection.split(",");

        //helper method to go through choices and add it to Sandwich class condimentsArray
        s.setCondiments(getCondimentsFromUserToAddToSandwich(selections));
        System.out.println("Your chosen condiments have been added to your sandwich");
//================================Add Sides===========================================//
        System.out.print("Sides Menu ");
        displaySideMenu();
        String sideSelection = Console.PromptForString();
        selections = sideSelection.split(",");

        //helper method to go through choices and add it to Sandwich class sidesArray
        s.setSides(getSidesFromUserToAddToSandwich(selections));
        System.out.println("Your chosen sides have been added to your sandwich");

//================================Toast Sandwich===========================================//
        String toasted = Console.PromptForString("Would you like the sandwich toasted? (yes/no): ");
        //I want to change to simple boolean because continues to throw error
        if(toasted.toLowerCase().equals("yes")){
            s.setToasted(true);
        }


        // this should be called after you have completed the entire sandwich!!

        //  order.addSandwich(s);
       order.addItemToOrder(s);

       // orderItems.add("Sandwich: " + size + " " + bread + " with " + meat + ", " + cheese + ", toppings: " + toppings + ", sauces: " + sauces + ", toasted: " + toasted);
        System.out.println("Sandwich added to order.");
    }

    //Drink selection
    public static void addDrink() {


        System.out.println("\nAdding Drink:");

        System.out.print("Select drink size: ");
        String size = scanner.nextLine().toUpperCase();

        System.out.print("Select drink flavor: ");
        String flavor = scanner.nextLine();

        Drink d = new Drink(size,flavor);
        order.addItemToOrder(d);
       // orderItems.add("Drink: " + size + " " + flavor);
        System.out.println("Drink added to order.");
    }

    //Chip selection
   public static void addChips() {
        System.out.println("\nAdding Chips:");

        System.out.print("Select chip type: ");
        String chipType = scanner.nextLine();

      //  orderItems.add("Chips: " + chipType);
        Chips c = new Chips(chipType);
        order.addItemToOrder(c);
        System.out.println("Chips added to order.");
    }

    //Checkout menu, displays order summary, confirms order and creates a receipt file
    public static void checkout() {
        System.out.println("\nCheckout:");
        System.out.println("Order Summary:");
        for (MenuItem item : order.getItems()) {
            System.out.println(item);
          //  System.out.println(item);
        }
        System.out.println("Total price: " + order.getPrice());

        System.out.print("Confirm order? (yes/no): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Order confirmed. Creating receipt...");
            // Logic to create receipt file

        } else {
            System.out.println("Order canceled.");
            orderItems.clear();
        }
    }

    public static int getChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }

    public static void displayMeatMenu(){
        ArrayList<String> meatCopy = allToppings.getMeats();

        System.out.println("Please select the meats you would like to add");
        System.out.println("For more than 1 meat, separate by commas");
        for(int i = 0; i<meatCopy.size();i++){
            System.out.println(i+1 + ")" + meatCopy.get(i));
        }

    }

    public static ArrayList<String> getMeatsFromUserToAddToSandwich(String[] selections){

        ArrayList<String> meatToppings = new ArrayList<>();

        if(selections[0].equals("7")){

                return new ArrayList<>();

        } else {

            for (String selection : selections) {

                int index = Integer.parseInt(selection) - 1;

                String meat = allToppings.getMeats().get(index);

                meatToppings.add(meat);
            }
            return meatToppings;
        }

    }

   public static void displayCheeseMenu() {
        ArrayList<String> cheeseCopy = allToppings.getCheeses();

        System.out.println("Please select the cheeses you would like to add");
        System.out.println("For more than 1 cheese, separate by commas");
        for (int i = 0; i < cheeseCopy.size(); i++) {
            System.out.println(i + 1 + ")" + cheeseCopy.get(i));
        }

    }
    public static ArrayList<String> getCheesesFromUserToAddToSandwich(String[] selections){

        ArrayList<String> cheeseToppings = new ArrayList<>();

        for(String selection: selections){

            int index = Integer.parseInt(selection) - 1;

            String cheese = allToppings.getCheeses().get(index);

            cheeseToppings.add(cheese);
        }

        return cheeseToppings;
    }

    public static void displayRegularToppingsMenu(){
        ArrayList<String> regularToppingCopy = allToppings.getRegularToppings();

        System.out.println("Please select the regular toppings you would like to add");
        System.out.println("For more than 1 regular topping, separate by commas");
        for(int i = 0; i<regularToppingCopy.size();i++){
            System.out.println(i+1 + ")" + regularToppingCopy.get(i));
        }

    }

    public static ArrayList<String> getRegularToppingsFromUserToAddToSandwich(String[] selections){

        ArrayList<String> regularToppingToppings = new ArrayList<>();

        for(String selection: selections){

            int index = Integer.parseInt(selection) - 1;

            String regularTopping = allToppings.getRegularToppings().get(index);

            regularToppingToppings.add(regularTopping);
        }

        return regularToppingToppings;
    }

    public static void displayCondimentMenu(){
        ArrayList<String> condimentCopy = allToppings.getCondiments();

        System.out.println("Please select the condiments you would like to add");
        System.out.println("For more than 1 condiment, separate by commas");
        for(int i = 0; i<condimentCopy.size();i++){
            System.out.println(i+1 + ")" + condimentCopy.get(i));
        }

    }

    public static ArrayList<String> getCondimentsFromUserToAddToSandwich(String[] selections){

        ArrayList<String> condimentToppings = new ArrayList<>();

        for(String selection: selections){

            int index = Integer.parseInt(selection) - 1;

            String condiment = allToppings.getCondiments().get(index);

            condimentToppings.add(condiment);
        }

        return condimentToppings;
    }

    public static void displaySideMenu(){
        ArrayList<String> sideCopy = allToppings.getSides();

        System.out.println("Please select the sides you would like to add");
        System.out.println("For more than 1 side, separate by commas");
        for(int i = 0; i<sideCopy.size();i++){
            System.out.println(i+1 + ")" + sideCopy.get(i));
        }

    }

    public static ArrayList<String> getSidesFromUserToAddToSandwich(String[] selections){

        ArrayList<String> sideToppings = new ArrayList<>();

        for(String selection: selections){

            int index = Integer.parseInt(selection) - 1;

            String side = allToppings.getSides().get(index);

            sideToppings.add(side);
        }

        return sideToppings;
    }


}