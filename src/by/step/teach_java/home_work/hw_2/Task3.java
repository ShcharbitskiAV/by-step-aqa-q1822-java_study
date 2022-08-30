import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner animal = new Scanner(System.in);
        byte sound = animal.nextByte();

        /* List of animals:
        1 - cat;
        2 - dog;
        3 - cow;
        4 - pig;
        5 - horse;
        6 - cock; петух
        7 - crow; ворона
        8 - fly; муха
        9 - wolf;
        10 - lion;   */

        switch (sound) {
            case (1): {
            System.out.println("Meow");
            break;}

            case (2): {
                System.out.println("Gav");
            break;}

            case (3): {
            System.out.println("Muuuu");
            break;}

            case (4): {
            System.out.println("Hryu");
            break;}

            case (5): {
            System.out.println("Igo-go");
            break; }

            case (6): {
            System.out.println("Ku-ka-reku");
            break;}

            case (7): {
            System.out.println("Kaaar-kaaaar");
            break;}

            case (8): {
            System.out.println("z-z-z-z");
            break;}

            case (9): {
            System.out.println("Auuuuuu");
            break;}

            case (10): {
            System.out.println("Rychit");
            break;}

            default:
                System.out.println("Incorrect input");
                break;

        }
    }

}