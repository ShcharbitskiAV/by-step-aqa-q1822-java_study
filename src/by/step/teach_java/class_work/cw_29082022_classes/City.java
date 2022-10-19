package by.step.teach_java.class_work.cw_29082022_classes;

import java.util.Scanner;

public class City {
    private String cityName;
    private String regionName;
    private String countryName;
    private int countResidentsOfCity;
    private int postcode;
    private int numbercode;

    private final Scanner scan = new Scanner(System.in);

    public City(String cityName, String regionName) {
        this.cityName = cityName;
        this.regionName = regionName;
    }

    public City (String countryName, int countResidentsOfCity, int postcode, int numbercode) {
        this.countryName = countryName;
        this.countResidentsOfCity = countResidentsOfCity;
        this.postcode = postcode;
        this.numbercode = numbercode;
    }

    public City(String cityName, String regionName, String countryName, int countResidentsOfCity, int postcode, int numbercode) {
        this.cityName = cityName;
        this.regionName = regionName;
        this.countryName = countryName;
        this.countResidentsOfCity = countResidentsOfCity;
        this.postcode = postcode;
        this.numbercode = numbercode;
    }
}
