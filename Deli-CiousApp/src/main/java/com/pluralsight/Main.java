package com.pluralsight;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
    private static final Scanner scanner = new Scanner(System.in);
    private static List<String> orderItems = new ArrayList<String> 1();

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

    private static void startNewOrder() {
        orderItems.clear();
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

            int choice = getChoice();

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
    private static void addSandwich() {
        System.out.println("\nAdding Sandwich:");

        System.out.print("Select your bread: ");
        String bread = scanner.nextLine();

        System.out.print("Sandwich size: ");
        String size = scanner.nextLine();

        System.out.print("Meat type: ");
        String meat = scanner.nextLine();

        System.out.print("Cheese type: ");
        String cheese = scanner.nextLine();

        System.out.print("Other toppings (comma separated): ");
        String toppings = scanner.nextLine();

        System.out.print("Select sauces (comma separated): ");
        String sauces = scanner.nextLine();

        System.out.print("Would you like the sandwich toasted? (yes/no): ");
        String toasted = scanner.nextLine();

        orderItems.add("Sandwich: " + size + " " + bread + " with " + meat + ", " + cheese + ", toppings: " + toppings + ", sauces: " + sauces + ", toasted: " + toasted);
        System.out.println("Sandwich added to order.");
    }

    //Drink selection
    private static void addDrink() {
        System.out.println("\nAdding Drink:");

        System.out.print("Select drink size: ");
        String size = scanner.nextLine();

        System.out.print("Select drink flavor: ");
        String flavor = scanner.nextLine();

        orderItems.add("Drink: " + size + " " + flavor);
        System.out.println("Drink added to order.");
    }

    //Chip selection
    private static void addChips() {
        System.out.println("\nAdding Chips:");

        System.out.print("Select chip type: ");
        String chipType = scanner.nextLine();

        orderItems.add("Chips: " + chipType);
        System.out.println("Chips added to order.");
    }

    //Checkout menu, displays order summary, confirms order and creates a receipt file
    private static void checkout() {
        System.out.println("\nCheckout:");
        System.out.println("Order Summary:");
        for (String item : orderItems) {
            System.out.println(item);
        }
        System.out.println("Total price: [calculate based on items]");

        System.out.print("Confirm order? (yes/no): ");
        String confirm = scanner.nextLine();
        if (confirm.equalsIgnoreCase("yes")) {
            System.out.println("Order confirmed. Creating receipt...");
            // Logic to create receipt file
            orderItems.clear();
        } else {
            System.out.println("Order canceled.");
            orderItems.clear();
        }
    }

    private static int getChoice() {
        System.out.print("Enter your choice: ");
        while (!scanner.hasNextInt()) {
            System.out.print("Invalid input. Enter a number: ");
            scanner.next();
        }
        return scanner.nextInt();
    }
}