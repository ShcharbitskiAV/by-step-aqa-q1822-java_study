package by.step.teach_java.home_work.hw_5_arrays;
public class Pr4_3 {
    public static void main(String[] args) {
        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 50);

            System.out.print(array[i] + " ");
        }

            System.out.println("\n");

            int temp;

            for (int i = 0; i < array.length / 2; i++) {
                temp = array[array.length - i - 1];
                array[array.length - i - 1] = array[i];
                array[i] = temp;
            }

            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i] + " "); //reverse
            }
        }
    }
