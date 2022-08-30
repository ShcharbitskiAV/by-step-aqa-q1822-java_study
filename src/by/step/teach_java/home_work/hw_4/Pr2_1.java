import java.util.Scanner;

public class Pr2_1 {
    public static class Storage {
        Scanner scan = new Scanner(System.in);
        String s;

        public Storage() {
            s = scan.nextLine();
        }

        int storage(String s) {
            return s.length() * 2; //x2
        }

        void print() {
            System.out.println("The string has " + storage(s) + " " + "symbols (because x2)");
        }

        public static void main(String[] args) {
            Storage str = new Storage();
            str.print();
        }
    }
}