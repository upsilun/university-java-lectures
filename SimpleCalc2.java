import java.util.Scanner;


public class SimpleCalc2 {
    private double x;
    private double y;

    public double getx() {
        return x;
    }

    public void setx(double x) {
        this.x = x;
    }

    public SimpleCalc2() {
    }

    public void find() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter operation (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        double result = 0;
        if (operation == '+') {
            result = number1 + number2;
        } else if (operation == '-') {
            result = number1 - number2;
        } else if (operation == '*') {
            result = number1 * number2;
        } else if (operation == '/') {
            result = number1 / number2;
        } else {
            System.out.println("Invalid operation!");
            return;
        }

        System.out.println(number1 + " " + operation + " " + number2 + " = " + result);
    }

    public static void main(String[] args) {
        SimpleCalc2 calculator = new SimpleCalc2();
        calculator.find();
    }
}
