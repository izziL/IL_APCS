public class GasPriceTracker {
    private String name;
    private double price;
    // Constructor using "this" keyword
    public GasPriceTracker(String name, double price) {
        this.name = name;
        this.price = price;
    }
    // Accessor and mutator methods
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
}