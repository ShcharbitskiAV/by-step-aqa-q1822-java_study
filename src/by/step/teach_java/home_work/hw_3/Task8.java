import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input number: ");
        int digit = number.nextInt();
        int countOfDigit = 0;
        int sumOfDigit;
        int sum = 0;

        for ( ; digit != 0; digit /= 10)
            countOfDigit++;

        System.out.println("Count of numbers: " + countOfDigit);

        for (sumOfDigit = number.nextInt(); sumOfDigit != 0; sumOfDigit /= 10)

            sum = sum + (sumOfDigit % 10);

        System.out.println("Sum of numbers: " + sum);

    }
}
