package by.step.teach_java.class_work.cw_17102022_exceptions;

public class MainClassExceptions {
    public static void main(String[] args) {
        MainClassExceptions mainClassExceptions = new MainClassExceptions();
        try {
            mainClassExceptions.methodWithException();
        } catch (MyException e) {
            System.err.println(e.getMessage() + "\n");
        }

        try {
            mainClassExceptions.methodWithExceptionTwo();
        } catch (MyExceptionTwo ex) {
            System.out.println(ex.getMessage());
        }

    }

    public void methodWithException() throws MyException {
        throw new MyException("Hello from method with exception");
    }

    public void methodWithExceptionTwo() throws MyExceptionTwo {
        throw new MyExceptionTwo("Hello from my second method with exception");

    }
}
