package by.step.teach_java.class_work.cw_08082022;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Task3 object = new Task3();

        Scanner scan = new Scanner(System.in);
        System.out.print("Input your text: ");
        String text = scan.nextLine();
        int [] array = object.workWithArrays(text);
        int res = object.getSumOfNumbers(array);
        object.countAndShowResult(res, array);

    }

        public int [] workWithArrays (String text) {

            String[] array = text.split(" ");
            int[] secondArray = new int[array.length];
            for (int i = 0; i < array.length; i++) {
                secondArray[i] = array[i].length();
            }
            return secondArray;
        }


        public int getSumOfNumbers (int [] array) {
            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum += array[i];
            }
            return sum;
        }

        public void countAndShowResult (int sum, int [] array) {

         System.out.println(sum / array.length);

        }
    }
