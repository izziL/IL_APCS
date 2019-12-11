public class SweetGarage {
    public static void main(String[] args) {
        // Make five cars.
        Car one = new Car(2013, 50_000, "Toyota", "Rav4");
        Car two = new Car(2008, 100_000, "Toyota", "minivan");
        Car three = new Car(2018, 5_000, "Turbo Car Company", "New Turbo Car", true);
        Car four = new Car(2016, 25_000, "Normal Car Company", "Boring Car", false);
        Car five = new Car(2014, 10_000, "Turbo Car Company 2", "Old Turbo Car", true);
        // Statements explaining what's in each car.
        System.out.println("The first car in my garage was made in " + one.year + " by " + one.manufacturerName + ". The model is " + one.modelName + " and it has been driven " + one.milesDriven + " miles.");
        System.out.println("The second car in my garage was made in " + two.year + " by " + two.manufacturerName + ". The model is " + two.modelName + " and it has been driven " + two.milesDriven + " miles.");
        System.out.println("The third car in my garage was made in " + three.year + " by " + three.manufacturerName + ". The model is " + three.modelName + " and it has been driven " + three.milesDriven + " miles. Does it have turbo? " + three.hasTurbo);
        System.out.println("The fourth car in my garage was made in " + four.year + " by " + four.manufacturerName + ". The model is " + four.modelName + " and it has been driven " + four.milesDriven + " miles. Does it have turbo? " + four.hasTurbo);
        System.out.println("The fifth car in my garage was made in " + five.year + " by " + five.manufacturerName + ". The model is " + five.modelName + " and it has been driven " + five.milesDriven + " miles. Does it have turbo? " + five.hasTurbo + "\n");
        // Rev the engine of one of the cars.
        three.revEngine();
        System.out.println("\n");
        // Switch on the turbo for one of the cars.
        three.engageTurbo();
    }
}
