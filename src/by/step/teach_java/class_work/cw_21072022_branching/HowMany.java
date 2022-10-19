package by.step.teach_java.class_work.cw_21072022_branching;

import java.util.Scanner;

public class HowMany {
    public static void main(String[] args) {
        Scanner words = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = words.nextLine();

        int sum = 0;

        if (text.length() != 0) {
            sum++;
        }

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                sum++;
            }
        }

        if (text.charAt(text.length() - 1) == ' ') {
            sum--;
        }
        System.out.println("Sum of words: " + sum);
    }
}
