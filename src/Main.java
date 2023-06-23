public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int sum = calculator.add(5, 3);
        int difference = calculator.subtract(8, 4);
        int product = calculator.multiply(6, 2);
        int quotient = calculator.divide(10, 2);
        int squared = calculator.square(4);

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Squared: " + squared);

        MagicCalculator magicCalculator = new MagicCalculator();
        double sqrt = magicCalculator.squareRoot(25);
        double sinValue = magicCalculator.sin(Math.PI / 2);
        double cosValue = magicCalculator.cos(0);
        double tanValue = magicCalculator.tan(Math.PI / 4);
        int factorialValue = magicCalculator.factorial(5);

        System.out.println("Square root: " + sqrt);
        System.out.println("Sine value: " + sinValue);
        System.out.println("Cosine value: " + cosValue);
        System.out.println("Tangent value: " + tanValue);
        System.out.println("Factorial value: " + factorialValue);
    }
}