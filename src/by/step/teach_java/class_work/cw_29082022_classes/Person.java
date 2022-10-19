package by.step.teach_java.class_work.cw_29082022_classes;

import java.util.Scanner;

public class Person {
    private String fio;
    private int dateOfBirth;
    private int numberOfPhone;
    private String city;
    private String country;
    private String homeAddress;

    private final Scanner scan = new Scanner(System.in);

    public Person(String fio, int dateOfBirth) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
    }

    public Person (int numberOfPhone, String city, String country, String homeAddress) {
        this.numberOfPhone = numberOfPhone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }

    public Person (String fio, int dateOfBirth, int numberOfPhone, String city, String country, String homeAddress) {
        this.fio = fio;
        this.dateOfBirth = dateOfBirth;
        this.numberOfPhone = numberOfPhone;
        this.city = city;
        this.country = country;
        this.homeAddress = homeAddress;
    }
}
