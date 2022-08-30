public class Pr3_1 {
    public static void main(String[] args) {

        float positiveInfinity = 2.0f / 0f;
        float negativeInfinity = -2.0f / 0f;
        double positive = 5.0 / 0;
        double negative = -5.0 / 0;
        double nan = positive / negative;

        System.out.println(positiveInfinity);
        System.out.println(negativeInfinity);
        System.out.println(nan + "\n");

        System.out.println("Value for type double: " + (negative < -0.0 == 0.0 < positive));
        System.out.println("Value for type float: " + (negativeInfinity < -0.0 == 0.0 < positiveInfinity));
    }
}
