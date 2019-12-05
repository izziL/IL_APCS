public class ComputeAnExpressionTwo {
    public static void main(String[] args) {
        // Make a calculator.
        ReturningCalculator calculator = new ReturningCalculator();
        // Compute the equation.
        double answer = calculator.divider(calculator.doubleSubtractor(calculator.doubleMultiplier(9.5, 4.5), calculator.doubleMultiplier(2.5, 3)), calculator.doubleSubtractor(45.5,3.5));
        // Print out a statement saying what the answer is.
        System.out.println("The answer to the equation is " + answer + ".");
    }
}