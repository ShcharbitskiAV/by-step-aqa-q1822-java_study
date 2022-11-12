package by.step.teach_java.home_work.hw_10_inherit.Pr8_6;

public class Car {

    private String bodytype;

    public static void main(String[] args) {
        Car car1 = new Car();
        car1.bodytype = "CABRIOLET";

        for (CarBody carBody : CarBody.values()) {
            System.out.print(carBody + " ");
            System.out.print(carBody.getConsumption() + " ");
            System.out.println(carBody.getPrice() + "\n");

        }

    }


}
