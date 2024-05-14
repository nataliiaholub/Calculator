package hw13_calculator;

public class Calculator {
    public static double calculate(double operand1, double operand2, char operator) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case 'x':
                return operand1 * operand2;
            case '/':
                if (operand2 != 0) {
                    return operand1 / operand2;
                } else {
                    throw new ArithmeticException("Division by zero is not allowed");
                }
            default:
                throw new ArithmeticException("Invalid operator" + operator);
        }
    }

    public static void main(String[] args) {
        if (args.length != 3) {
            System.out.println("Usage: java Calculator operand1 operand2 operator");
            System.exit(1);
        }
        try {
            double operand1 = Double.parseDouble(args[0]);
            char operator = args[1].charAt(0);
            double operand2 = Double.parseDouble(args[2]);

            double result = calculate(operand1, operand2, operator);
            System.out.println("Result: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid number. Please provide numeric values.");
            System.exit(1);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            System.exit(1);
        }
    }
}

