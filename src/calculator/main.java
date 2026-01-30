package calculator;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter your calculation: ");
        String userInput = input.nextLine();
        String[] parts = userInput.split(" ");
        if (parts.length != 3) {
            System.out.println("Invalid input format. Please use: number operator number");
            return;
        }
        double a = Double.parseDouble(parts[0]);
        char operator = parts[1].charAt(0);
        double b = Double.parseDouble(parts[2]);

        Calculator calc = new Calculator();

        double result = calc.calculate(a,operator,b);

        System.out.println("The result is: " + result);

    }
}