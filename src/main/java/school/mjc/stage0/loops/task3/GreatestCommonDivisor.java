package school.mjc.stage0.loops.task3;

public class GreatestCommonDivisor {
    public void printGCD(int first, int second) {
        int i = 1;
        int divider = 1;
        while (i > first || i > second) {
            if (first % i == 0 && second % i ==0) {
                divider = i;
            }
        }
        System.out.println(divider);
    }
}
