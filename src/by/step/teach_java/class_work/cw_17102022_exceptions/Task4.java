package by.step.teach_java.class_work.cw_17102022_exceptions;

import java.util.Scanner;

public class Task4 {
    Integer numbers = 0;
    String text = "";
    String[] array;

    public static void main(String[] args) {
        Task4 task4 = new Task4();

        System.out.println("Input your numbers: ");
        Scanner scan = new Scanner(System.in);
        task4.text = scan.nextLine();
        task4.array = task4.text.split("\\+");

        task4.myException(task4.text);

        int[] array = task4.workWithArrays();
        int result = task4.getSumOfNumbers(array);

        System.out.println(result);

    }

    public void myException(String text) {
        for (String number : array
        ) {
            try {
                Integer.parseInt(number);
                System.out.println(numbers);
            } catch (NumberFormatException e) {
                System.out.println(text + " is not a numbers. Repeat, please");

                System.out.println("Input your numbers: ");
                Scanner scan = new Scanner(System.in);
                text = scan.nextLine();
                myException(text);
            }

        }

    }

    public int getSumOfNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum;
    }

    public int[] workWithArrays() {

        int[] secondArray = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            secondArray[i] = array[i].length();
        }
        return secondArray;
    }

}
