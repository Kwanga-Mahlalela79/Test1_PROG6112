
package test1_prog6112;
import java.util.Locale;
import java.util.Scanner;

/**
 * Question 1 - Number 1 Coffee Hut beverage report
 * Uses single and two-dimensional arrays.
 */
public class Test1_PROG6112 {

    private static final String LINE =
            "------------------------------------------------------------------";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        input.useLocale(Locale.US);

        // Single arrays
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        String[] beverages = {"COFFEE", "TEA", "BOBA TEA"};
        double[] cityTotals = new double[cities.length];

        // Two-dimensional array: rows = cities, columns = beverages
        double[][] sales = new double[cities.length][beverages.length];

        // ---- Capture ----
        System.out.println(LINE);
        System.out.println("NUMBER 1 COFFEE HUT APPLICATION");
        System.out.println(LINE);

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < beverages.length; j++) {
                System.out.print("Enter the number of " + beverages[j]
                        + " sales for " + cities[i] + ": ");
                sales[i][j] = input.nextDouble();
            }
        }
        System.out.println(LINE);

        // ---- Calculate totals ----
        double grandTotal = 0;
        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < beverages.length; j++) {
                cityTotals[i] += sales[i][j];
            }
            grandTotal += cityTotals[i];
        }

        // ---- Report ----
        System.out.println("NUMBER 1 COFFEE HUT REPORT");
        System.out.println(LINE);
        System.out.printf("%-20s", "");
        for (String beverage : beverages) {
            System.out.printf("%-12s", beverage);
        }
        System.out.println();

        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s", cities[i]);
            for (int j = 0; j < beverages.length; j++) {
                System.out.print(String.format(Locale.US, "%-12.2f", sales[i][j]));
            }
            System.out.println();
        }
        System.out.println(LINE);

        System.out.println("PRODUCT SALES TOTALS FOR EACH CITY");
        System.out.println(LINE);
        for (int i = 0; i < cities.length; i++) {
            System.out.println(String.format(Locale.US, "%-20sR%.2f", cities[i], cityTotals[i]));
        }
        System.out.println();
        System.out.println(String.format(Locale.US, "TOTAL SALES FOR CITIES: R%.2f", grandTotal));
        System.out.println(LINE);

        input.close();
    }
}