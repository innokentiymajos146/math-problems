package com.example.math;

import java.util.Random;

public class MathProblems {
  public static int solve(int x, int y) {
    Random random = new Random();
    int operation = random.nextInt(4);
    if (operation == 0) {
      return x + y;
    } else if (operation == 1) {
      return x - y;
    } else if (operation == 2) {
      return x * y;
    } else {
      return x / y;
    }
  }
}
