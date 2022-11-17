package by.step.teach_java.home_work.hw_4_string;

import java.util.Scanner;

public class Pr2_1 {

    public int storage(String s) {

        return s.length() * 2;
    }

    void showResult() {
        System.out.println("Input your words: ");
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        System.out.println("The string has " + storage(s) + " " + "symbols (because x2)");
    }

    public static void main(String[] args) {

        Pr2_1 task2 = new Pr2_1();
        task2.showResult();
    }
}