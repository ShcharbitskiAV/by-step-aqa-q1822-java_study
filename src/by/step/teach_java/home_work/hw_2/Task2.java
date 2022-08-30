import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner timeofday = new Scanner(System.in);
        byte time = timeofday.nextByte();

        if (time >= 0 && time <= 6) {
            System.out.println("Good night");

        } else if (time > 6 && time <= 12) {
            System.out.println("Good morning");

        } else if (time > 12 && time < 19) {
            System.out.println("Good afternoon");

        } else if (time >= 19 && time <= 24) {
            System.out.println("Good evening");
        }
    }
}
