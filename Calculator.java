import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number1: ");
        double num1 = input.nextDouble();

        System.out.println("Enter the number2: ");
        double num2 = input.nextDouble();

        System.out.println("Enter the operators (+ , -, *, / )");
        char ch = input.next().charAt(0);

        double result;

        switch (ch) {
            case '+':
                result = num1 + num2;
                break;

            case '-':
                result = num1 - num2;
                break;

            case '*':
                result = num1 * num2;
                break;

            case '/':
                result = num1 / num2;
                break;

            default:
                System.out.println("Invalid operators: ");
                return;
        }
        System.out.println(num1 + " " + ch + " " + num2 + " = " + result);

    }
}