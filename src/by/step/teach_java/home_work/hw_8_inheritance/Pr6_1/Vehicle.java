package by.step.teach_java.home_work.hw_8_inheritance.Pr6_1;

public class Vehicle {
    String nameOfVehicle;
    String color;
    int yearRelease;

   public void characteristicsOfCar (String nameOfVehicle) {
       this.nameOfVehicle = nameOfVehicle;

   }

    public void characteristicsOfCar (String nameOfVehicle, String color) {
        this.nameOfVehicle = nameOfVehicle;
        this.color = color;

    }

    public void characteristicsOfCar (String nameOfVehicle, String color, int yearRelease) {
        this.nameOfVehicle = nameOfVehicle;
        this.color = color;
        this.yearRelease = yearRelease;

    }
}
