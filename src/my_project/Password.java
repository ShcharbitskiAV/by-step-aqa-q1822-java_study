package my_project;

import java.util.Scanner;

public class LoginAndPassword extends AdminMenu {

    private String adminPassword = "nimda";

    private String userPassword = "resu";
    private boolean pass = true;

    public void checkAdminPassword() {

        System.out.println("Ok, you are admin. Please, input your password: ");

        Scanner scan = new Scanner(System.in);
        adminPassword = scan.nextLine();

        if (adminPassword.equals("nimda")) {
            System.out.println("Ok, you admin");
            adminMenu.showMenu();
        } else {
            System.out.println("Incorrect password");
        }
    }

    public void checkUserPassword() {

        System.out.println("Ok, you are user. Please, input your password: ");

        Scanner scan = new Scanner(System.in);
        userPassword = scan.nextLine();

        if (adminPassword.equals("resu")) {
            System.out.println("You are user");
            adminMenu.showMenu();
        } else {
            System.out.println("Incorrect password");
        }
    }

}
