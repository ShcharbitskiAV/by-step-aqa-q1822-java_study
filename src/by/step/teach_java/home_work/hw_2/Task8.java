import java.util.Scanner;

public class Task8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x: ");
        int x = scan.nextInt();
        System.out.print("Enter y: ");
        int y = scan.nextInt();

        if (x % 2 == 0 && y % 2 == 0) {
            System.out.println("Yes");
        }
        else if (y % 2 != 0 && x % 2 != 0) {
            System.out.println("Yes");
        }
    }
}
