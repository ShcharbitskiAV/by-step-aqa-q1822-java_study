import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner days = new Scanner(System.in);
        System.out.print("Input the year: ");
        int year = days.nextInt();

        if (year % 4 == 0 && year % 400 == 0 | year % 100 > 0) {
            System.out.println("366 days"); }
        else {
            System.out.println("365 days");
        }
    }
}