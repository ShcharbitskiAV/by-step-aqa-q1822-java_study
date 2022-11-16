package by.step.teach_java.home_work.hw_5_arrays.Pr3_2;
public class Pr3_2 {
    public static void main(String[] args) {
        Binary bin = new Binary();

        bin.firstDigit = 232;
        bin.secondDigit = 233;

        System.out.println("First digit = " + Integer.toBinaryString(bin.firstDigit));
        System.out.println("Second digit = " + Integer.toBinaryString(bin.secondDigit));
        System.out.println("First digit & Second digit = " + Integer.toBinaryString(bin.firstDigit & bin.secondDigit));
        System.out.println("First digit | Second digit = " + Integer.toBinaryString(bin.firstDigit | bin.secondDigit));
        System.out.println("First digit ^ Second digit = " + Integer.toBinaryString(bin.firstDigit ^ bin.secondDigit));
        System.out.println("~First digit = " + Integer.toBinaryString(~bin.firstDigit));
        System.out.println("~Second digit = " + Integer.toBinaryString(~bin.secondDigit));
        System.out.println("First digit >> 1 = " + Integer.toBinaryString(bin.firstDigit >> 1));
        System.out.println("First digit << 1 = " + Integer.toBinaryString(bin.firstDigit << 1));
        System.out.println("-First digit >>> 1 = " + Integer.toBinaryString(-bin.firstDigit >>> 1));
        System.out.println("Second digit >> 1 = " + Integer.toBinaryString(bin.secondDigit >> 1));
        System.out.println("Second digit << 1 = " + Integer.toBinaryString(bin.secondDigit << 1));
        System.out.println("-Second digit >>> 1 = " + Integer.toBinaryString(-bin.secondDigit >>> 1));

    }
}
