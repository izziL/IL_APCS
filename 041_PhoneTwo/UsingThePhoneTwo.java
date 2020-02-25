public class UsingThePhoneTwo {
    public static void main(String[] args) {
        // Create three phone objects
        Phone original = new Phone();
        Phone newNumber = new Phone("651-987-6543");
        Phone newPhone = new Phone("612-216-6126");
        // Use toString method
        System.out.println("Original Phone: " + original.toString());
        System.out.println("Phone With New Number: " + newNumber.toString());
        System.out.println("New Phone: " + newNumber.toString());
        // Show the objects work and are different
        System.out.println("Th original phone's number is: " + original.getNumber() + ".");
        System.out.println("The second phone's number is: " + newNumber.getNumber() + ".");
        System.out.println("Th new phone's number is: " + newPhone.getNumber() + ".");
    }
}