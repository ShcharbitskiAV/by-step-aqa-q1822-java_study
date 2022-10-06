package by.step.teach_java.home_work.hw_2;
<<<<<<< HEAD

=======
>>>>>>> 6356e345aa65f4928bb0ba5cd6a8a36e83d38996
import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter a six number: ");
        int num = number.nextInt();

            int num1 = num / 100000;
            int num2 = (num / 10000) % 10;
            int num3 = (num / 1000) % 10;
            int num4 = (num / 100) % 10;
            int num5 = (num / 10) % 10;
            int num6 = num % 10;

            if (num1 + num2 + num3 == num4 + num5 + num6) {
                System.out.println("Number is lucky"); }

            else { System.out.println("Number is unlucky");
        }
    }
}
