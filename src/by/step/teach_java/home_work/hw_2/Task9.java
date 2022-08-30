import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner road = new Scanner(System.in);
        System.out.print("Enter road section: ");
        int x = road.nextInt(); //Отрезок дороги протяженностью в 20 км: первые 5 ровная дорога,
                                // затем 7 км - подьем, спуск 3 км и в конце снова ровная.


        if (x >= 0 && x<= 5) {
            System.out.println("Smooth road");
        }
        else if (x > 5 && x <= 12) {
            System.out.println("Road up");
        }
        else if (x > 12 && x <= 15) {
            System.out.println("Downhill");
        }
        else if (x > 15 && x <= 20) {
            System.out.println("Again smooth road");
        }
    }
}
