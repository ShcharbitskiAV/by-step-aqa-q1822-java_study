import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter coordinates x: ");
        int x = scan.nextInt();
        System.out.print("Enter coordinates y: ");
        int y = scan.nextInt();

        if (x > 0 && y > 0) {
            System.out.println("I");}

        else if (x < 0 && y > 0) {
                System.out.println("II");}

        else if (x < 0 && y < 0) {
            System.out.println("III");  }

        else {
            System.out.println("IV");  }
            }
}
