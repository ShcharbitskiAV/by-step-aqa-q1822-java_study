package by.step.teach_java.home_work.hw_4_string.Pr1_4;
public class Pr1_4 {
    public static void main(String[] args) {
        Spaceship s1 = new Spaceship();
        s1.name = "Spaceship 1";
        s1.speed = 300;

        Spaceship s2 = new Spaceship();
        s2.name = "Spaceship 2";
        s2.speed = 500;


        System.out.println("Spaceship name: " + s1.name + " spaceship speed " + s1.speed);
        System.out.println("Spaceship name: " + s2.name + " spaceship speed " + s2.speed);

        s1.showSpaceshipName();
        s1.showSpaceshipSpeed();

        s2.showSpaceshipName();
        s2.showSpaceshipSpeed();
    }
}
