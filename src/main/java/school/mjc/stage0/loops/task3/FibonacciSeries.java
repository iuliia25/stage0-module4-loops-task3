package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c = a + b;

        while (c <= lastFibonacci) {
            a = b;
            b = c;
            System.out.println(c);
            c = a + b;
        }
    }
}
