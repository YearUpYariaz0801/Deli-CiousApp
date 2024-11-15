package com.pluralsight.Utilities;

import com.pluralsight.BaseClasses.MenuItem;
import com.pluralsight.BaseClasses.Order;
import com.pluralsight.OtherOrderItems.Chips;
import com.pluralsight.OtherOrderItems.Drink;
import com.pluralsight.SandwichBuilder.Sandwich;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Receipts {
    // Method to generate and save the receipt
    public static void generateReceipt(Order order, String customerName) {
        // Create a StringBuilder object to construct the receipt text
        StringBuilder receipt = new StringBuilder();

        // Append receipt header information
        receipt.append("Receipt:\n");
        receipt.append("Customer Name: ").append(customerName).append("\n");
        receipt.append("Date: ").append(LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"))).append("\n");
        receipt.append("-----------------------------\n");

        // Iterate through each item in the order and append its details to the receipt
        for (MenuItem item : order.getItems()) {
            if (item instanceof Sandwich) {
                Sandwich sandwich = (Sandwich) item;
                receipt.append("  Size: ").append(sandwich.getSize()).append("\n");
                receipt.append("  Bread: ").append(sandwich.getBread()).append("\n");
                receipt.append("  Toasted: ").append(sandwich.isToasted() ? "Yes" : "No").append("\n");
                receipt.append("  Toppings:\n");
                for (String topping : sandwich.getRegularToppings()) {
                    receipt.append("    - ").append(topping).append("\n");
                }

                receipt.append("  Total: $").append(sandwich.calculateTotalCost(new Sandwich())).append("\n");
            } else if (item instanceof Drink) {
                Drink drink = (Drink) item;
                receipt.append("Drink: ").append(drink.getFlavor()).append(" (").append(drink.getSize()).append(") - $").append(drink.getPrice()).append("\n");
            } else if (item instanceof Chips) {
                Chips chips = (Chips) item;
                receipt.append("Chips: ").append(chips.getChip()).append(" - $").append(chips.getPrice()).append("\n");

            }
        }

        // Append the total cost of the order
        receipt.append("-----------------------------\n");
        receipt.append("Total: $").append(order.getPrice()).append("\n");


        // Ensure the receipts directory exists, create if not
        File directory = new File("receipts");
        if (!directory.exists()) {
            directory.mkdir();
        }

        // Create a unique filename based on the current date and time
        String filename = LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyyMMdd-HHmmss")) + ".txt";

        // Write the receipt to a file
        try (FileWriter writer = new FileWriter(new File(directory, filename))) {
            writer.write(receipt.toString());
            // Print the receipt to the console
            System.out.println(receipt);
            System.out.println("Receipt saved as " + filename);
        } catch (IOException e) {
            // Handle any errors that occur during file writing
            System.out.println("An error occurred while saving the receipt: " + e.getMessage());
        }
    }
}
