
import java.util.Random;

public class MathProblem {
  private static final Random rand = new Random();

  public int getRandomNumber(int min, int max) {
    return rand.nextInt((max - min) + 1) + min;
  }
}