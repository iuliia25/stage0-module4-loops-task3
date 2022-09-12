package school.mjc.stage0.loops.task3;

public class DigitsSum {
    public void printDigitsSum(int t){
     String number = toString(t);
     int sum = 0;
     for (int i = 0; i < number.length(); i ++) {
         sum += Integer.parseInt(number, i);
     }
        System.out.println(sum);
    }

    private String toString(int t) {
        return null;
    }
}
