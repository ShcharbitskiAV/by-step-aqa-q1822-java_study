package by.step.teach_java.class_work.cw_07072022_intro_tasks;
import java.util.Locale;
import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.UK);
        System.out.print("Input a number: ");
        double num = in.nextDouble();

        if((num %1) == 0) {

            System.out.println("num is an integer");

        } else {

            System.out.println("num is not an integer");

        }
    }
}
