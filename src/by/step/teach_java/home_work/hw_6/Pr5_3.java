package by.step.teach_java.home_work.hw_6;

import java.util.Arrays;

public class Pr5_3 {
    public static void main(String[] args) {
        Pr5_3 mas = new Pr5_3();
        mas.arrays();

    }

    public void arrays() {
        int[][] arrayTwoD = new int[5][3];
        System.out.println(Arrays.deepToString(arrayTwoD));
        System.out.println();

        int[][][] arrayThreeD = new int[3][4][6];
        arrayThreeD[0] = arrayTwoD;
        System.out.println(Arrays.deepToString(arrayThreeD));
    }

}
