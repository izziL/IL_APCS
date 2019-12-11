public class CarAge {
    public static void main(String[] args) {
        // Make five cars.
        Car one = new Car(2013, 50_000, "Toyota", "Rav4");
        Car two = new Car(2008, 100_000, "Toyota", "minivan");
        Car three = new Car(2018, 5_000, "Turbo Car Company", "New Turbo Car", true);
        Car four = new Car(2016, 25_000, "Normal Car Company", "Boring Car", false);
        Car five = new Car(2014, 10_000, "Turbo Car Company 2", "Old Turbo Car", true);
        // Set the current year in a variable.
        int year = 2019;
        // Create a new calculator.
        ReturningCalculator calculator = new ReturningCalculator();
        // Age of car one.
        int oneAge = calculator.integerSubtractor(year, one.year);
        System.out.println("The age of the " + one.manufacturerName + " " + one.modelName + " is " + oneAge + " years old.");
        // Age of car two.
        int twoAge = calculator.integerSubtractor(year, two.year);
        System.out.println("The age of the " + two.manufacturerName + " " + two.modelName + " is " + twoAge + " years old.");
        // Age of car three.
        int threeAge = calculator.integerSubtractor(year, three.year);
        System.out.println("The age of the " + three.manufacturerName + " " + three.modelName + " is " + threeAge + " years old.");
        // Age of car four.
        int fourAge = calculator.integerSubtractor(year, four.year);
        System.out.println("The age of the " + four.manufacturerName + " " + four.modelName + " is " + fourAge + " years old.");
        // Age of car five.
        int fiveAge = calculator.integerSubtractor(year, five.year);
        System.out.println("The age of the " + five.manufacturerName + " " + five.modelName + " is " + fiveAge + " years old.");
    }
}
