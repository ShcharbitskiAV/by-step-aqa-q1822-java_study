package by.step.teach_java.home_work.hw_2;
<<<<<<< HEAD

=======
>>>>>>> 6356e345aa65f4928bb0ba5cd6a8a36e83d38996
import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner home = new Scanner(System.in);
        System.out.print("Enter number of flat: ");
        int number = home.nextInt(); //Четырехэтажный дом, в нем 40 квартир и 5 подъездов,
                                //в каждом подъезде по 8 квартир.


        if (number >= 1 && number <= 8) {
            System.out.println("Первый подъезд");
        }
        else if (number >= 9 && number <= 16) {
            System.out.println("Второй подъезд");
        }
        else if (number >= 17 && number <= 24) {
            System.out.println("Третий подъезд");
        }
        else if (number >= 25 && number <= 32) {
            System.out.println("Четвертый подъезд");
    }
        else if (number >= 33 && number <= 40) {
            System.out.println("Пятый подъезд");
        }
}
}
