package by.step.teach_java.home_work.hw_11_exception;

public class Pr9_5 {

    public static void main(String[] args) {
        Pr9_5 pr = new Pr9_5();
        pr.g();
        System.out.println();
        pr.f();
    }

    public void f() throws RuntimeException {
        try {
            g();
        }
        catch (RuntimeException ex) {
            ex.getMessage();
        }

    }

    public void g() throws ArrayIndexOutOfBoundsException {
        try {
            int [] array = new int[2];
            array[0] = 2;
            array[1] = 1;
            array[2] = 0;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

    }
}
