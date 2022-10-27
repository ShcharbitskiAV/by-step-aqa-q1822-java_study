package by.step.teach_java.class_work.cw_17102022_exceptions;

public class MyExceptionTwo extends RuntimeException {
    String message;

    public MyExceptionTwo(String message) {
        super(message);
    }
}
