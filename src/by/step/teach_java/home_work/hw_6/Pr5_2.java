package by.step.teach_java.home_work.hw_6;

public class Pr5_2 {
    int aField;
    static int bField;

    public void aMethod() {
        int a = 1;
        System.out.println(a);
    }

    public static void bMethod() {
        int b = 2;
        System.out.println(b);

    }

    public static void main(String[] args) {
        Pr5_2 object = new Pr5_2();
        object.aField();
        object.aMethod();
        Pr5_2.bField();
        Pr5_2.bMethod();

    }
}
