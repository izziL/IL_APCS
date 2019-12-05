import java.util.Scanner;

public class CarBuilderOne {
    public static void main(String[] args) {
        // Make a scanner.
        Scanner scanner = new Scanner(System.in);
        // Create variables to hold the car values.
        String make;
        String model;
        int year;
        int miles;
        // Ask the user to enter the make, model, year and mileage.
        System.out.print("What make of car would you like? ");
        make = scanner.nextLine().toUpperCase();
        System.out.print("What model of car would you like? ");
        model = scanner.nextLine().toUpperCase();
        System.out.print("What year would you like your car to be made in? ");
        year = scanner.nextInt();
        System.out.print("What would you like the mileage of your car to be? ");
        miles = scanner.nextInt();
        // Turn off scanner.
        scanner.close();
        // Create a new car.
        Car car = new Car(year, miles, make, model);
        // Tell them you found the car they requested.
        System.out.println("I have found the car you have requested. The make is " + car.manufacturerName + ", the model is " + car.modelName + ", it was manufactured in " + car.year + ", and it has been driven " + car.milesDriven + " miles.");
    }
}