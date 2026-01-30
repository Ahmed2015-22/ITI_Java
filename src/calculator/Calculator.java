package calculator;

public class Calculator {

    public double calculate(double a, char operator ,double b) {
        switch (operator) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return a / b;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed.");
                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + operator);
        }
    }
}
