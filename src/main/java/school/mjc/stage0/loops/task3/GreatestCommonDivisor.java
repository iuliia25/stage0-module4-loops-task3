package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
      int divisor = 1;
      if (first > second) {
          for (int i = 1; i <= second; i ++) {
              if (first / i == 0 && second / i == 0) {
                  divisor = i;
              }
          }
          System.out.println(divisor);
      } else {
          for (int f = 1; f <= first; f ++) {
              if (first / f == 0 && second / f == 0) {
                  divisor = f;
              }
          }
          System.out.println(divisor);
      }
    }
}
