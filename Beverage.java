
package test1_prog6112;

public abstract class Beverage implements IBeverage {

    private final String beverageType;
    private final String city;
    private final int totalSales;

    public Beverage(String beverageType, String city, int totalSales) {
        this.beverageType = beverageType;
        this.city = city;
        this.totalSales = totalSales;
    }

    @Override
    public String getBeverageType() {
        return beverageType;
    }

    @Override
    public String getCity() {
        return city;
    }

    @Override
    public int getTotalSales() {
        return totalSales;
    }

    // Implemented by subclasses
    public abstract void printReport();
}