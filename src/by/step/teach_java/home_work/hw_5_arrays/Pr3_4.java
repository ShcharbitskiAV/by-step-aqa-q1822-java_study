package by.step.teach_java.home_work.hw_5_arrays;

public class Pr3_4 {
    public static void main(String[] args) {
        for (int i = 2; i < 50; i++) {

            int k = 0;

            for (int j = 2; j <= i; j++) {

                if ((i % j) == 0)
                    k++;
            }

            if (k < 2) {

                System.out.print(i + " ");

            }
        }
    }
}
