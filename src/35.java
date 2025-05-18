public class MathProblems {
    public static void main(String[] args) {
        // Example code to solve a mathematical problem
        double result = solveMathProblem(10, 2.5);
        System.out.println("The result is: " + result);
    }

    // Method to solve a mathematical problem
    private static double solveMathProblem(int a, int b) {
        return (double)(a * b) / Math.pow(a - b, 2);
    }
}
