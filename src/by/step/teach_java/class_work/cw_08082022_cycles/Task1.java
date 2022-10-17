package by.step.teach_java.class_work.cw_08082022_cycles;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = scan.nextLine();
        System.out.print("Input your symbol: ");
        String symbol = scan.nextLine();
        char c = symbol.charAt(0);
        char[] array = symbol.toCharArray();


        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= c) {
                count++;
            }
            System.out.println(count);
        }
    }
}
