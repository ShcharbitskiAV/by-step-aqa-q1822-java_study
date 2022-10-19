package by.step.teach_java.class_work.cw_29082022_classes;

import java.util.Scanner;

public class Calculator {
    private Scanner scan = new Scanner(System.in);
    private double x = scan.nextDouble();
    private double y = scan.nextDouble();

    public Calculator(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Calculator () {
        this.x = x;
        this.y = y;
    }

    public double summa() {
        System.out.print("Summa: ");
        return x + y;
    }

    public double minus() {
        System.out.print("Minus: ");
        return x - y;
    }

    public double umnojenie() {
        System.out.print("Umnojenie: ");
        return x * y;
    }

    public double delenie() {
        System.out.print("Delenie: ");
        return x / y;
    }


}
