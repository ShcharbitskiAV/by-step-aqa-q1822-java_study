package by.step.teach_java.home_work.hw_5_arrays;
public class Pr4_1 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);

            System.out.print(array[i] + " ");
        }

        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int j2 = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = j2;
                }
            }
        }

        System.out.println("\n" + "After sorting: ");

        for (int j : array) {
            System.out.print(j + " ");
        }

    }
}
