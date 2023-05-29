import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = s.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = s.nextDouble();

        System.out.println("Select operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        int op = s.nextInt();
        double result = 0;

        switch (op) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                result = num1 / num2;
                break;
        }

        System.out.println("Answer: " + result);

    }
}