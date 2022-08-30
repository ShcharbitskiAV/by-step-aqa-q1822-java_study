public class Task3 {
    public static void main(String[] args) {
        for (int i = 6, h = 0; i > 0 & h < 6; i--, h++) {
            for (int j = 0; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < h; j++) {
                System.out.print("*");
            }
            for (int j = 1; j < h; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
