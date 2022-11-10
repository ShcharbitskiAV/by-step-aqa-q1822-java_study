package by.step.teach_java.home_work.hw_10_inherit;

import java.util.Scanner;

public class Employee {
    protected int age;
    private String firstName;
    private String secondName;
    private int experience;
    private int salary;


    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.verifyAge();

    }

    public void verifyAge() {
        System.out.println("Input your age: ");
        Scanner scan = new Scanner(System.in);
        age = scan.nextInt();
        if (age < 1 || age > 100) {
            System.out.println("Age incorrect");
        } else {
            System.out.println("Good!");
        }

    }

}
