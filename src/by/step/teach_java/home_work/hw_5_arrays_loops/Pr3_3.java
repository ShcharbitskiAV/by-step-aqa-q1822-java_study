package by.step.teach_java.home_work.hw_5_arrays_loops;

public class Pr3_3 {
    public static void main(String[] args) {

        StringBuilder digit = new StringBuilder("0123456789");

        digit.replace(0, 4, ""); //456789
        digit.delete(4, 6); //4567
        digit.insert(1, 2); //42567
        digit.append(7); //425677
        digit.replace(2, 5, ""); //427
        System.out.println(digit.insert(2, 4));

        //VersionTwo


        String secondWay = "0123456789";
        String secondWay2 = "4247";
        secondWay = secondWay.substring(10);
        secondWay = secondWay.concat(secondWay2);

        System.out.println(secondWay);
    }
}