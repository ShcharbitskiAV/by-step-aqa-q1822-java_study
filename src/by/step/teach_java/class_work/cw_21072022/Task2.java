package by.step.teach_java.class_work.cw_21072022;
public class Task2 {
    public static void main(String[] args) {
        int[] array = new int[12];
        int lastIndex = 0;
        int minNumber = -15;

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 31) - 15;

            if (minNumber <= array[i]) {
                minNumber = array[i];
                lastIndex = i;
            }
        }
        System.out.println("Last index in array: " + lastIndex);

    }
}
