package by.step.teach_java.class_work.cw_29082022;

import java.util.Scanner;

public class Car {
    private String nameOfCar;
    private String nameOfManufacturer;
    private int yearOfRelease;
    private double engineVolume;

    Scanner scan = new Scanner(System.in);

    public Car(String nameOfCar, String nameOfManufacturer, int yearOfRelease) {
        this.nameOfCar = nameOfCar;
        this.nameOfManufacturer = nameOfManufacturer;
        this.yearOfRelease = yearOfRelease;
    }

    public Car(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public Car(String nameOfCar, String nameOfManufacturer, int yearOfRelease, double engineVolume) {
        this.nameOfCar = nameOfCar;
        this.nameOfManufacturer = nameOfManufacturer;
        this.yearOfRelease = yearOfRelease;
        this.engineVolume = engineVolume;
    }

    public String getNameOfCar() {
        return nameOfCar;
    }

    public void setNameOfCar() {
        System.out.print("Name of car: ");
        this.nameOfCar = scan.nextLine();
    }

    public String getNameOfManufacturer() {
        return nameOfManufacturer;
    }

    public void setNameOfManufacturer() {
        System.out.print("Name of manufacturer: ");
        this.nameOfManufacturer = scan.nextLine();
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public void setYearOfRelease() {
        System.out.print("Year release of car: ");
        this.yearOfRelease = scan.nextInt();
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume() {
        System.out.print("Engine volume of car: ");
        this.engineVolume = scan.nextDouble();
    }

}
