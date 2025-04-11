import org.javatuples.Pair;

public class MathProblems {
    public static void main(String[] args) {
        Pair<Integer, Integer> result = calculateSquareAndAddOne(3);
        System.out.println("Result: " + result.getFirst() + ", " + result.getSecond());
    }

    private static int calculateSquare(int number) {
        return number * number;
    }
}
