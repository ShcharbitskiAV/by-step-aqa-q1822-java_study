package by.step.teach_java.class_work.cw_2508202_getters_setters;

import java.util.Scanner;

public class Person {
    private String fio;
    private int dateOfBirth;
    private int numberOfPhone;
    private String city;
    private String country;
    private String homeAddress;

    private final Scanner scan = new Scanner(System.in);

    public void setDateOfBirth () {
        System.out.print("Input your date of birth: ");
        this.dateOfBirth = scan.nextInt();
    }

    public int getDateOfBirth () {
        return dateOfBirth;
    }

    public void setFio () {
        System.out.print("Input your name and last name: ");
        this.fio = scan.nextLine();
    }

    public String getFio () {
        return fio;
    }

    public void setNumberOfPhone () {
        System.out.print("Input your number of phone: ");
        this.numberOfPhone = scan.nextInt();
    }

    public int getNumberOfPhone () {
        return numberOfPhone;
    }

    public void setCity () {
        System.out.print("Input your city: ");
        this.city = scan.nextLine();
    }

    public String getCity () {
        return city;
    }

    public void setCountry () {
        System.out.print("Input your country: ");
        this.country = scan.nextLine();
        System.out.println("Your country: " + this.country);
    }

    public String getCountry () {
        return country;
    }

    public void setHomeAddress () {
        System.out.print("Input your home address: ");
        this.country = scan.nextLine();
        System.out.println("Your home address: " + this.country);
    }

    public String getHomeAddress () {
        return homeAddress;
    }

}
