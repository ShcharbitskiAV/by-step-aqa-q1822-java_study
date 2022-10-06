package by.step.teach_java.home_work.hw_4;
public class Pr1_4 {
    public static void main(String[] args) {
        Spaceship mains = new Spaceship();
        mains.firstSpaceship();
        mains.secondSpaceship();
    }
}

class Spaceship {
    String s = "Spaceship #1";
    String s1 = "Spaceship #2";

    public void firstSpaceship() {
        Spaceship name = new Spaceship();
        System.out.println("Field s: " + name.s);
    }

    public void secondSpaceship() {
        Spaceship name1 = new Spaceship();
        System.out.println("Field s1: " + name1.s1);
    }
}
