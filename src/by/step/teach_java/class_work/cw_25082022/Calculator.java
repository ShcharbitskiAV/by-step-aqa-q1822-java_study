package by.step.teach_java.class_work.cw_25082022;

import java.util.Scanner;

public class Calculator {

    private Scanner scan = new Scanner(System.in);
    private double x = scan.nextDouble();
    private double y = scan.nextDouble();


    public double summa() {
        System.out.print("Summa: ");
        return x + y;
    }

    public double minus() {
        System.out.print("Minus: ");
        return x - y;
    }

    public double umnozhenie() {
        System.out.print("Umnojenie: ");
        return x * y;
    }

    public double delenie() {
        System.out.print("Delenie: ");
        return x / y;
    }
}
