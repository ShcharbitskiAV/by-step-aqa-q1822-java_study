package by.step.teach_java.class_work.cw_21072022;
<<<<<<< HEAD

=======
>>>>>>> 6356e345aa65f4928bb0ba5cd6a8a36e83d38996
import java.util.Arrays;
import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner array = new Scanner(System.in);
        System.out.println("Input size of array: ");
        int n = array.nextInt();

        if (n <= 3) {
            System.out.print("You input don't correct number! Please, input information again");
        } else {
            System.out.println("Thanks!");
        }

        int[] firstArray = {0, 1, 2, 15, 567, 345353, 56756, 123, 90};
        System.out.println("First array: " + Arrays.toString(firstArray));

        int[] secondArray = {2, 56756, 90};

        System.out.println("Even elements of the second array: " + Arrays.toString(secondArray));
    }
}
