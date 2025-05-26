import java.util.Scanner;

public class MathProblemSolver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Get user input
        System.out.println("Enter a mathematical expression:");
        String expression = scanner.nextLine();
        
        // Evaluate the expression
        double result = calculateExpression(expression);
        
        // Print the result
        System.out.println("The result of the expression is: " + result);
    }
    
    private static double calculateExpression(String expression) {
        return solveExpression(expression);
    }
    
    private static double solveExpression(String expression) {
        double leftHandSide = evaluateLeftHandSide(expression);
        double rightHandSide = evaluateRightHandSide(expression);
        
        if (leftHandSide == rightHandSide) {
            return 1.0;
        } else if (expression.contains("+") || expression.contains("-")) {
            switch (expression.charAt(0)) {
                case "+":
                    return leftHandSide + rightHandSide;
                case "-":
                    return leftHandSide - rightHandSide;
            }
        } else if (expression.contains("*") || expression.contains("/")) {
            double left = evaluateExpression(expression, 1);
            double right = evaluateExpression(expression, 2);
            
            if (right == 0.0) {
                throw new IllegalArgumentException("Division by zero encountered");
            }
            
            return left * right;
        } else {
            throw new UnsupportedOperationException("Unsupported operator: " + expression.charAt(0));
        }
    }
    
    private static double evaluateExpression(String expression, int number) throws UnsupportedException {
        if (expression.contains("(")) {
            return parseExpression(expression.substring(1), number);
        } else {
            return calculateExpression(expression);
        }
    }
    
    private static double calculateExpression(String expression) {
        double leftHandSide = 0;
        double rightHandSide = 0;
        
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            
            switch (currentChar) {
                case '+':
                    leftHandSide += evaluateExpression(expression, i + 1);
                    break;
                case '-':
                    leftHandSide -= evaluateExpression(expression, i + 1);
                    break;
                case '*':
                    rightHandSide *= evaluateExpression(expression, i + 1);
                    break;
                case '/':
                    rightHandSide /= evaluateExpression(expression, i + 1);
                    break;
            }
        }
        
        return leftHandSide - rightHandSide;
    }
    
    private static double evaluateLeftHandSide(String expression) {
        double result = 0;
        
        for (int i = 0; i < expression.length(); i++) {
            char currentChar = expression.charAt(i);
            
            switch (currentChar) {
                case '+':
                    result += parseExpression(expression, i + 1);
                    break;
                case '-':
                    result -= parseExpression(expression, i + 1);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operator: " + currentChar);
            }
        }
        
        return result;
    }
    
    private static double evaluateRightHandSide(String expression) {
        double result = 0.0;
        
        for (int i = expression.length() - 1; i >= 0; i--) {
            char currentChar = expression.charAt(i);
            
            switch (currentChar) {
                case '+':
                    result += parseExpression(expression, i + 1);
                    break;
                case '-':
                    result -= parseExpression(expression, i + 1);
                    break;
                default:
                    throw new IllegalArgumentException("Unsupported operator: " + currentChar);
            }
        }
        
        return result;
    }
    
    private static double calculateRightHandSide(String expression) {
        double left = evaluateLeftHandSide(expression);
        double right = evaluateRightHandSide(expression);
        
        if (left == right) {
            return 1.0;
        } else if (expression.contains("+") || expression.contains("-")) {
            switch (expression.charAt(0)) {
                case "+":
                    return left + right;
                case "-":
                    return left - right;
            }
        } else if (expression.contains("*") || expression.contains("/")) {
            double left = evaluateExpression(expression, 1);
            double right = evaluateExpression(expression, 2);
            
            if (right == 0.0) {
                throw new IllegalArgumentException("Division by zero encountered");
            }
            
            return left * right;
        } else {
            throw new UnsupportedOperationException("Unsupported operator: " + expression.charAt(0));
        }
    }
    
    private static double parseExpression(String expression, int start) {
        String numberPart = expression.substring(start);
        
        try {
            double result = Double.parseDouble(numberPart);
            
            if (expression.contains("(")) {
                return parseExpression(expression.substring(1), 0);
            } else {
                for (int i = start + 1; i < expression.length(); i++) {
                    char currentChar = expression.charAt(i);
                    
                    switch (currentChar) {
                        case '+':
                            result += Double.parseDouble(numberPart);
                            break;
                        case '-':
                            result -= Double.parseDouble(numberPart);
                            break;
                        case '*':
                            if (!expression.contains("(")) {
                                return Math.pow(result, Double.parseDouble(numberPart));
                            } else {
                                return parseExpression(expression.substring(1), 0);
                            }
                        default:
                            throw new IllegalArgumentException("Unsupported operator: " + currentChar);
                    }
                }
            }
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Invalid expression format");
        }
        
        return result;
    }
}
