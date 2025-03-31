public class MathProblems {
    public static void main(String[] args) {
        // Example problem: Find the sum of all even numbers in an array
        int[] numbers = {1, 2, 3, 4, 5};
        double sum = 0.0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum of even numbers: " + sum);
    }
}
