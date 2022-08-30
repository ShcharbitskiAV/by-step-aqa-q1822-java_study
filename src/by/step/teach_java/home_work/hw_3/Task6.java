import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner nums = new Scanner(System.in);
        System.out.print("Input number of steps: ");
        int numberOfSteps = nums.nextInt();
        int numberOfStars = 3;

        for (int i = 0; i < numberOfSteps; i++) {
            for (int j = 0; j < i * (numberOfStars - 1); j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < numberOfStars; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
