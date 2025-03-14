import java.util.Random;

public class MathProblems {
    public static int getRandomNumber() {
        Random rand = new Random();
        int min = 1;
        int max = 100;
        return rand.nextInt(max - min + 1) + min;
    }
}
