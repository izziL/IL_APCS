public class Cat {
    // Variables
    private String name;
    private double weight;
    // Cat constructor
    public Cat(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }
    // Getters and setters
    public void setName(String newName) {
        name = newName;
    }
    public String getName() {
        return name;
    }
    public void setWeight(double newWeight) {
        weight = newWeight;
    }
    public double getWeight() {
        return weight;
    }
}