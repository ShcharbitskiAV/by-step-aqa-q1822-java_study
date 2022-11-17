package by.step.teach_java.home_work.hw_4_string;
public class Pr2_4 {

    private int count = 0;
    private int summOfNumbers = 0;

    private int getRandomNumber(int from, int till) {
        return (int) (from + Math.random() * till);
    }

    private double arithmeticMeanTwoValues(int summOfNumbers, int count) {
        return summOfNumbers / count;
    }

    public static void main(String[] args) {
        Pr2_4 pr2_4 = new Pr2_4();
        int currentValue = 0;
        System.out.print("Generated number : ");
        do {
            currentValue = pr2_4.getRandomNumber(0, 10);

            if (currentValue != 0) {
                System.out.print(" " + currentValue);
            }

            pr2_4.count++;
            pr2_4.summOfNumbers += currentValue;

        } while (currentValue != 0);

        pr2_4.count--;
        System.out.println();
        System.out.println("Count " + pr2_4.count);
        System.out.println("Summ of numbers " + pr2_4.summOfNumbers);

        System.out.println("Arithmetic mean: " + pr2_4.arithmeticMeanTwoValues(pr2_4.summOfNumbers, pr2_4.count));
    }
}

