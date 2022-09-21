package by.step.teach_java.home_work.hw_6;

public class Pr5_1 {
    private String nameOfCar;
    private String colorOfCar;
    private int yearOfRelease;

    public Pr5_1(String nameOfCar, String colorOfCar, int yearOfRelease) {
        this.nameOfCar = nameOfCar;
        this.colorOfCar = colorOfCar;
        this.yearOfRelease = yearOfRelease;
    }

    public static void main(String[] args) {
        Pr5_1 vehicle = new Pr5_1 ("Mercedes-Benz", "silver", 2020);
        System.out.println(vehicle.nameOfCar);
        System.out.println(vehicle.colorOfCar);
        System.out.println(vehicle.yearOfRelease);

    }
}
