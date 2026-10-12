
package test1_prog6112;

import java.util.Scanner;

public class RunApplication {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] beverages = {"COFFEE", "TEA", "BOBA"};

        // Select type of beverage
        int choice = 0;
        while (choice < 1 || choice > beverages.length) {
            System.out.println("Select the beverage type");
            for (int i = 0; i < beverages.length; i++) {
                System.out.println((i + 1) + ") " + beverages[i]);
            }
            System.out.println();
            try {
                choice = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                choice = 0;
            }
            if (choice < 1 || choice > beverages.length) {
                System.out.println("Invalid choice, please try again.\n");
            }
        }
        String beverageType = beverages[choice - 1];

        // Enter city name
        System.out.print("Enter the city: ");
        String city = input.nextLine().trim().toUpperCase();

        // Enter total sales made
        int totalSales = -1;
        while (totalSales < 0) {
            System.out.print("Enter the total sales of " + beverageType
                    + " beverages in " + city + " :");
            try {
                totalSales = Integer.parseInt(input.nextLine().trim());
            } catch (NumberFormatException e) {
                totalSales = -1;
            }
            if (totalSales < 0) {
                System.out.println("Please enter a valid whole number.");
            }
        }

        // Subclass and print report
        BeverageSales sales = new BeverageSales(beverageType, city, totalSales);
        System.out.println();
        sales.printReport();

        input.close();
    }
}