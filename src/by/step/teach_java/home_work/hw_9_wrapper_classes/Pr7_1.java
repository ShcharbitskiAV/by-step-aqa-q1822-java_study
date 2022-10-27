package by.step.teach_java.home_work.hw_9_wrapper_classes;

public class Pr7_1 {

    public static void main(String[] args) {
        Pr7_1 objectForSumNumbers = new Pr7_1();
        objectForSumNumbers.sumInteger(1, 2);
        objectForSumNumbers.sumInt(1, 2);

    }

    public void sumInteger(Integer a, Integer b) {
        for (int i = 0; i <= 1000000; i++) {
            Integer result = a + b;
        }
        System.out.println("Time for Integer: " + System.currentTimeMillis());
    }

    public void sumInt(int c, int d) {
        for (int i = 0; i <= 1000000; i++) {
            int res = c + d;
        }
        System.out.println("Time for int: " + System.currentTimeMillis());
    }
}
