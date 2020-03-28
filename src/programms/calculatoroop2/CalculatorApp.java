package programms.calculatoroop2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculatorApp {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Write two numbers and +, -, * or / sign");
        char operator = 0;
        double firstNum = 0;
        double secondNum = 0;
        try {
            firstNum = scanner.nextDouble();
            secondNum = scanner.nextDouble();
            operator = scanner.next().charAt(0);
        } catch (InputMismatchException ime) {
            System.out.println("invalid input");
        }
        Calculator calculator = new Calculator();
        calculator.makeCalculation(firstNum, secondNum, operator);
    }
}
