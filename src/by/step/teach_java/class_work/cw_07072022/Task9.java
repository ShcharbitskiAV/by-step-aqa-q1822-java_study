import java.util.Locale;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        in.useLocale(Locale.UK);
        System.out.print("Input a number: ");
        double num = in.nextDouble();

        if((num %1) == 0) {

            System.out.println("num is an integer");

        } else {

            System.out.println("num is not an integer");

        }
    }
}
