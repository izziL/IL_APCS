public class Table {
    public static void main(String[] args) {
        CardDispenser one = new CardDispenser();
        String a = one.newCard();
        System.out.println(a);
        String b = one.newCard();
        System.out.println(b);
    }
}