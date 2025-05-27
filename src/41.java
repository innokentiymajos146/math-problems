import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();

        System.out.println("The sum of the two numbers is: " + (num1 + num2));
    }
}
