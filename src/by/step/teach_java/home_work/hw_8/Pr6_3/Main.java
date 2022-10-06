package by.step.teach_java.home_work.hw_8.Pr6_3;

public class Main {
    public static void main(String[] args) {
        Point coordinate = new Point();
        coordinate.x = 3;
        coordinate.y = 7;

        Point coordinate2 = new Point();
        coordinate2.x = 1;
        coordinate2.y = 5;

        System.out.println(coordinate.equals(coordinate2));
        System.out.println(coordinate.toString());
        System.out.println(coordinate2.toString());
        System.out.println(coordinate.hashCode());
        System.out.println(coordinate2.hashCode());
    }
}
