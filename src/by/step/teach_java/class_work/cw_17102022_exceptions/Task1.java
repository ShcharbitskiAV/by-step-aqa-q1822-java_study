package by.step.teach_java.class_work.cw_17102022_exceptions;

import java.util.Scanner;

public class Task1 {
    Integer number = 0;

    public static void main(String[] args) {
        Task1 t = new Task1();
        t.getCorrectNumberFromConsole();
        t.verifyRange();

        System.out.println(t.number + " number in range");
    }

    public void getCorrectNumberFromConsole() {
        Scanner scan = new Scanner(System.in);
        String str = null;

        try {
            System.out.println("Input your number: ");
            str = scan.nextLine();
        } catch (NumberFormatException e) {
            System.out.println(str + "is not a number");
            getCorrectNumberFromConsole();
        }

    }

    public void verifyRange() {
        try {
            verifyInputedNumber();
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
            getCorrectNumberFromConsole();
            verifyRange();
        }
    }

    public void verifyInputedNumber() throws IllegalArgumentException {
        if (number < 0 || number > 9)
            throw new IllegalArgumentException("Not in range 0-9");
    }

}
