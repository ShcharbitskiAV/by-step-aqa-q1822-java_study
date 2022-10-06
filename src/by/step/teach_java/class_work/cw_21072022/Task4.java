package by.step.teach_java.class_work.cw_21072022;
import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        int[] firstArray = new int[5];
        int[] secondArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 5);
        }

        for (int i = 0; i < secondArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 5);
        }

        System.out.print(Arrays.toString(firstArray));
        System.out.println();
        System.out.print(Arrays.toString(secondArray));

        double medium = 0;
        double medium1 = 0;

        for (int i = 0; i < 5; i++) {
            medium = medium + firstArray[i];
            medium1 = medium1 + secondArray[i];

            medium = medium / 5;
            medium1 = medium1 / 5;
        }

        System.out.println();

        if (medium > medium1) {
            System.out.println("Array #1 more array #2");
        } else {
            System.out.println("Array #2 more array #1");
        }

        if (medium == 0 && medium1 == 0) {
            System.out.println("Arrays are equal");
        }

    }
}
