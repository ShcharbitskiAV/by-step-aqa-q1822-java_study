package by.step.teach_java.class_work.cw_13102022_unpackingdata;



public class DoOutOfMemoryError {

    public static void main(String[] args) {

        int [] array = new int[100000000 * 100000000 * 1000000000];

    }
}
