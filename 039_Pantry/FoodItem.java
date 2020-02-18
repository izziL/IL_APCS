public class FoodItem {
    // Variables for the types and amounts of food
    private double amount;
    private String amountUnit;
    private String color;
    private double weight;
    private double cost;
    // Creating the food
    public newFood(double number, String amountUnit, String foodColor, String foodWeight, double foodCost) {
        amount = number;
        amountUnit = numberUnit;
        color = foodColor;
        weight = foodWeight;
        cost = foodCost;
    }
    // Accessor methods
    public double getAmount() {
        return amount;
    }
    public String getAmountUnit() {
        return amountUnit;
    }
    public String getColor() {
        return color;
    }
    public double getWeight() {
        return weight;
    }
    public double cost() {
        return cost;
    }
    // Mutator method. The mutator method is only needed to change the amount of the item.
    public void setAmount(double newAmount) {
        amount = newAmount;
    }
}