package by.step.teach_java.class_work.cw_17102022_exceptions;

import java.util.Scanner;

public class Task2 {
    Integer number = 0;

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        task2.getNumbers();
        task2.verifyRange();

    }

    public void getNumbers () {
        Scanner scan = new Scanner(System.in);
        String str = null;

        try {
            System.out.println("Input your numbers: ");
            str = scan.nextLine();
            number = Integer.parseInt(str, 2);
            System.out.println(number);
        } catch (NumberFormatException e) {
            System.out.println(str + " is not a numbers");
            getNumbers();
        }

    }

    public void verifyRange() {
        try {
            verifyCorrectNumbers();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getNumbers();
            verifyRange();
        }
    }

    public void verifyCorrectNumbers() throws IllegalArgumentException {
        if (number < -6 || number > 6)
            throw new IllegalArgumentException("This number is not in range from -5 to 5");
    }

}
