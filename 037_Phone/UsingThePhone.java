public class UsingThePhone {
    public static void main(String[] args) {
        Phone phone = new Phone("651-111-1111", "black", 64, 3);
        phone.receiveCall("651-555-5555");
        phone.storage(30);
        phone.color();
        phone.age();
    }
}