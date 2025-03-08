import java.util.Random;

public class MathProblems {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(10);
        int b = rand.nextInt(10);
        System.out.println("What is " + a + "+" + b + "?");
    }
}