public class Task4 {
    public static void main(String[] args) {
        int number = 10;

        for (int i = 1; i < number/2; ++i) {

            for (int j = number/2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < 2 * i; ++j)
                System.out.print("*");

            System.out.println();
        }
        for (int i = number/2; i >= 1; --i) {

            for (int j = number/2; j > i; --j)
                System.out.print(" ");

            for (int j = 1; j < i*2; ++j)
                System.out.print("*");

            System.out.println();
        }
    }
}
