import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Input number: ");
        int num = number.nextInt();
        int rev = 0;

        for( ; num != 0; num /= 10) {
            int num2 = num % 10;
            rev = rev * 10 + num2;
        }

        System.out.println("Revers number: " + rev);

    }
}
