import java.util.Scanner;

public class MathProblems {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your first number: ");
        int num1 = scanner.nextInt();
        
        System.out.println("Enter your second number: ");
        int num2 = scanner.nextInt();
        
        System.out.println("Enter your third number: ");
        int num3 = scanner.nextInt();
        
        double sum = num1 + num2 + num3;
        System.out.println("The sum of three numbers is: " + sum);
    }
}
