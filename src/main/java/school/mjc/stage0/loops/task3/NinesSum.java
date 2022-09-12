package school.mjc.stage0.loops.task3;

public class NinesSum {
    public void calculateSum(int lengthOfLastNumber) {
        String sum = "";
        for (int i = 0; i < lengthOfLastNumber; i ++){
            sum += "9";
        }
        int lastNumber = Integer.parseInt(sum);
        int result = 0;
        for (int s = lastNumber; s >= 9; s = s / 10) {
            result += s;
        }
        System.out.println(result);
    }
}
