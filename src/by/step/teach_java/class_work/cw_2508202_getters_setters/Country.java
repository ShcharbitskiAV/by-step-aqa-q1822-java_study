package by.step.teach_java.class_work.cw_2508202_getters_setters;

import java.util.Scanner;

public class Country {
    private String countryName;
    private String continentName;
    private int countPeopleOfCountry;
    private int numberCodeCountry;
    private String nameOfCapital;
    private String nameOfCitiesCountry;

    private final Scanner scan = new Scanner(System.in);

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        System.out.print("by.step.teach_java.class_work.cw_25082022.Country: ");
        this.countryName = countryName;
    }

    public String getContinentName() {
        return continentName;
    }

    public void setContinentName(String continentName) {
        System.out.print("Continent: ");
        this.continentName = continentName;
    }

    public int getCountPeopleOfCountry() {
        return countPeopleOfCountry;
    }

    public void setCountPeopleOfCountry(int countPeopleOfCountry) {
        System.out.print("Count people of country: ");
        this.countPeopleOfCountry = countPeopleOfCountry;
    }

    public int getNumberCodeCountry() {
        return numberCodeCountry;
    }

    public void setNumberCodeCountry(int numberCodeCountry) {
        System.out.print("Number code of country: ");
        this.numberCodeCountry = numberCodeCountry;
    }

    public String getNameOfCapital() {
        return nameOfCapital;
    }

    public void setNameOfCapital(String nameOfCapital) {
        System.out.print("Name of capital: ");
        this.nameOfCapital = nameOfCapital;
    }

    public String getNameOfCitiesCountry() {
        return nameOfCitiesCountry;
    }

    public void setNameOfCitiesCountry(String nameOfCitiesCountry) {
        System.out.print("Name of cities country: ");
        this.nameOfCitiesCountry = nameOfCitiesCountry;
    }
}
