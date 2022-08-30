package by.step.teach_java.class_work.cw_25082022;

import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int countResidentsOfCity;
    private int postcode;
    private int numbercode;

    private final Scanner scan = new Scanner(System.in);

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        System.out.print("Your city name: ");
        this.cityName = scan.nextLine();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        System.out.print("Your region name: ");
        this.regionName = scan.nextLine();
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        System.out.print("Your country name: ");
        this.countryName = scan.nextLine();
    }

    public int getCountResidentsOfCity() {
        return countResidentsOfCity;
    }

    public void setCountResidentsOfCity(int countResidentsOfCity) {
        System.out.print("Your count residents of city: ");
        this.countResidentsOfCity = scan.nextInt();
    }

    public int getPostcode() {
        return postcode;
    }

    public void setPostcode(int postcode) {
        System.out.print("Your postcode: ");
        this.postcode = scan.nextInt();
    }

    public int getNumbercode() {
        return numbercode;
    }

    public void setNumbercode(int numbercode) {
        System.out.print("Your numbercode: ");
        this.numbercode = scan.nextInt();
    }
}
