public class Phone {
    //Variables
    private String number;
    private String color;
    private double storage;
    private double age;
    // Constructor
    public Phone(String phoneNumber, String phoneColor, double phoneStorage, double phoneAge) {
        number = phoneNumber;
        color = phoneColor;
        storage = phoneStorage;
        age = phoneAge;
    }
    // Methods
    public void receiveCall(String callNum) {
        System.out.println("Ring! Ring! Your number is " + number + ". The following number is calling you: " + callNum + ".");
    }
    public void storage(double storageUsed) {
        System.out.println("The total storage on your phone is " + storage + ".You have used " + storageUsed + "GB. This is " + (storageUsed / storage) + " percent of your storage.");
    }
    public void color() {
        System.out.println("The color of your phone is " + color + ".");
    }
    public void age() {
        System.out.println("The phone is " + age + " years old.");
    }
}