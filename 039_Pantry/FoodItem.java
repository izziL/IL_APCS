public class FoodItem {
    // Variables for the types and amounts of food
    private int amount;
    private String amountUnit;
    private String color;
    private String weight;
    private double cost;
    // Creating the food
    public FoodItem(int number, String numberUnit, String foodColor, String foodWeight, double foodCost) {
        amount = number;
        amountUnit = numberUnit;
        color = foodColor;
        weight = foodWeight;
        cost = foodCost;
    }
    // Accessor methods
    public int getAmount() {
        return amount;
    }
    public String getAmountUnit() {
        return amountUnit;
    }
    public String getColor() {
        return color;
    }
    public String getWeight() {
        return weight;
    }
    public double getCost() {
        return cost;
    }
    // Mutator method. The only mutator method needed is to change the amount of the item.
    public void setAmount(int newAmount) {
        amount = newAmount;
    }
}