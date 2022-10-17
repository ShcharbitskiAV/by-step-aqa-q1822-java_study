package by.step.teach_java.class_work.cw_08082022_cycles;
import java.util.Scanner;


public class Task2 {

    public static void main(String[] args) {
        Task2 task2 = new Task2();
        String num = task2.workInCycles();
        task2.showNumber(num);
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your number: ");
        int index = scan.nextInt();
        System.out.print(num.charAt(index));
    }

    public String workInCycles() {

        StringBuilder number = new StringBuilder();
        for (int i = 1; i < 1000; i++) {
            if (number.length() >= 1000) {
                break;
            } else {
                number.append(i);
            }
        }
        return number.toString();
    }

    public void showNumber(String number) {
        System.out.println(number);
    }
}
