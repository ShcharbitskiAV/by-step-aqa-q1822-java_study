package by.step.teach_java.class_work.cw_07072022_easytasks;
import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        double summavklada = 0;
        int vklad = 2000;
        double proc = 0.12;
        int srok = 730;

        summavklada = (proc * summavklada / 100) * srok;

        Scanner in = new Scanner(System.in);
        summavklada = in.nextDouble();

        System.out.println(summavklada);

    }
}
