package by.step.teach_java.home_work.hw_6;

public class Pr5_2 {
    static int a = 7;
    byte b;

    static int sum(int x, int y) {
        return x + y;
    }

    int multiplication(int x, int y) {
        return x * y;
    }

    public static void main(String[] args) {
        a = 5;
        // System.out.println(b); we can't call non-static value from static method

        sum(3, 2);
        //multiplication(3,3); we can't call non-static method from static method
    }
}
