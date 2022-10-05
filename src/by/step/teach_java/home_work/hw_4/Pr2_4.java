package by.step.teach_java.home_work.hw_4;
public class Pr2_4 {
    public static void main(String[] args) {
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 30));
            System.out.print(array[i] + " ");

            if (array[i] == 0) {
                System.out.print("Stop process");
                break;
            }
        }
    }
}

