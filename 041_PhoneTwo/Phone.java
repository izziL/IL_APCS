public class Phone {
    // Variables
    private String number;
    private String color;
    private double storage;
    private double age;
    // Constructors
    public Phone() {
        number = "651-222-3333";
        color = "white";
        storage = 64;
        age = 1.5;
    }
    public Phone(String number) {
        this.number = number;
        color = "white";
        storage = 64;
        age = 1.5;
    }
    public Phone(String number, String color, double storage, double age) {
        this.number = number;
        this.color = color;
        this.storage = storage;
        this.age = age;
    }
    // Accessor and mutator methods
    public String getNumber() {
        return number;
    }
    public String getColor() {
        return color;
    }
    public double getStorage() {
        return storage;
    }
    public double getAge() {
        return age;
    }
    // toString method
    public String toString() {
        return number + ", " + color + ", " + storage + ", " + age;
    }
}