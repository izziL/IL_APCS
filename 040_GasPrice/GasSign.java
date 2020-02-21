public class GasSign {
    public void getInfo(GasPriceTracker typeOfGas) {
        System.out.println(typeOfGas.getName() + " gas costs $" + typeOfGas.getPrice() + ".");
    }
    // Run program
    public static void main(String[] args) {
        GasPriceTracker unleaded = new GasPriceTracker("Unleaded", 2.49);
        GasPriceTracker plus = new GasPriceTracker("Plus", 2.79);
        GasPriceTracker premium = new GasPriceTracker("Premium", 2.99);
        GasSign gasPriceSign = new GasSign();
        gasPriceSign.getInfo(unleaded);
        gasPriceSign.getInfo(plus);
        gasPriceSign.getInfo(premium);
    }
}