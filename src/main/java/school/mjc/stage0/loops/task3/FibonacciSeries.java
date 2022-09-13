package school.mjc.stage0.loops.task3;

public class FibonacciSeries {
    public void printFibonacci(int lastFibonacci) {
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        int c;
        for (int i = 3; i <= lastFibonacci; i ++) {
            c = a + b;
            a = b;
            b = c;
            System.out.println(c);

        }
    }
}
