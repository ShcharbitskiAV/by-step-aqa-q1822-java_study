package by.step.teach_java.class_work.cw_29082022;

import java.util.Scanner;

public class Country {
    private String countryName;
    private String continentName;
    private int countPeopleOfCountry;
    private int numberCodeCountry;
    private String nameOfCapital;
    private String nameOfCitiesCountry;

    private final Scanner scan = new Scanner(System.in);

    public Country(String countryName, String continentName) {
        this.countryName = countryName;
        this.continentName = continentName;
    }

    public Country(int countPeopleOfCountry, int numberCodeCountry, String nameOfCapital, String nameOfCitiesCountry) {
        this.countPeopleOfCountry = countPeopleOfCountry;
        this.numberCodeCountry = numberCodeCountry;
        this.nameOfCapital = nameOfCapital;
        this.nameOfCitiesCountry = nameOfCitiesCountry;

    }

    public Country(String countryName, String continentName, int countPeopleOfCountry, int numberCodeCountry, String nameOfCapital, String nameOfCitiesCountry) {
        this.countryName = countryName;
        this.continentName = continentName;
        this.countPeopleOfCountry = countPeopleOfCountry;
        this.numberCodeCountry = numberCodeCountry;
        this.nameOfCapital = nameOfCapital;
        this.nameOfCitiesCountry = nameOfCitiesCountry;
    }
}
