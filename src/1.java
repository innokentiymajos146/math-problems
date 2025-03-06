import java.util.Random;

public class MathProblems {
    public static int solveMathProblem(int num1, int num2) {
        Random rand = new Random();
        int problemType = rand.nextInt(3); // 0 for addition, 1 for subtraction, 2 for multiplication
        switch (problemType) {
            case 0:
                return num1 + num2;
            case 1:
                return num1 - num2;
            case 2:
                return num1 * num2;
            default:
                throw new IllegalStateException("Invalid problem type");
        }
    }
}
