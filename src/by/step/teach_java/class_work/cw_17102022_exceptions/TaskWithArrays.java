package by.step.teach_java.class_work.cw_17102022_exceptions;

import java.util.Arrays;

public class TaskWithArrays {
    public static void main(String[] args) {
        TaskWithArrays taskWithArrays = new TaskWithArrays();
        int[] firstArray = {1, 3, 4};
        int[] secondArray = {1, 7, 9, 0};
        taskWithArrays.getFirstException(firstArray, 3, 2, secondArray, 1, 4);

        TaskWithArrays taskWithArrays1 = new TaskWithArrays();
        int[] thirtyArray = {1, 3, 6, 7};
        int[] fortyArray = {1, 12, 7678, 123, 456, 9, 0};
        taskWithArrays1.getFirstException(thirtyArray, 1, 6, fortyArray, 3, 34);

        TaskWithArrays taskWithArrays2 = new TaskWithArrays();
        int[] fiftyArray = null;
        int[] sixtyArray = {1, 12, 7678, 123, 456, 9, 0};
        taskWithArrays2.getFirstException(fiftyArray, 1, 6, sixtyArray, 3, 5);

    }

    public void getFirstException(int[] a, int aFromIndex, int aToIndex,
                                  int[] b, int bFromIndex, int bToIndex) {
        try {
            Arrays.compare(a, aFromIndex, aToIndex, b, bFromIndex, bToIndex);
        } catch (IllegalArgumentException e) {
            System.err.println("Keep calm, it's exceptions: IllegalArgumentException");
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.err.println("Dont worry, it's again exception. Now is - ArrayIndexOutOfBoundsException");
        } catch (NullPointerException exc) {
            System.err.println("Sorry guys, I don't to see it, but again exception: NullPointerException");
        }

    }
}
