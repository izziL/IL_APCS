public class PantryShelf {
    public void getInformation(FoodItem food) {
        System.out.println("This food item is: " + food.getAmountUnit() + ". There are " + food.getAmount() + " " + food.getAmountUnit() + ". The color of the food is " + food.getColor() + ". The total weight of the food is " + food.getWeight() + ". The cost of the food is $" + food.getCost() + ".");
    }
    public void eatFood(FoodItem food) {
        int amountEaten = (int) (Math.random() * food.getAmount() + 1);
        System.out.println("I want to eat " + amountEaten + " " + food.getAmountUnit() + ".");
        while (amountEaten > 0) {
            food.setAmount(food.getAmount() - 1);
            System.out.println("I ate a " + food.getAmountUnit() + ". There are " + food.getAmount() + " " + food.getAmountUnit() + " left. I want to eat " + (amountEaten - 1) + " more.");
            amountEaten--;
        }
    }
    public static void main(String[] args) {
        // Create food items
        FoodItem apple = new FoodItem(10, "apple", "red", "5 lbs", 5.00);
        FoodItem blueberry = new FoodItem(30, "blueberry", "blue", "3 oz", 3.50);
        FoodItem carrot = new FoodItem(15, "baby carrot", "orange", "3 oz", 1.50);
        // Eat the food
        PantryShelf pantry = new PantryShelf();
        pantry.getInformation(apple);
        pantry.eatFood(apple);
        pantry.getInformation(blueberry);
        pantry.eatFood(blueberry);  
        pantry.getInformation(carrot);
        pantry.eatFood(carrot);
    }
}