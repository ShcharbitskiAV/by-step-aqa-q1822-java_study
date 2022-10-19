package by.step.teach_java.home_work.hw_8_inheritance.Pr6_4;

public class Main {
    public static void main(String[] args) {
        Amphibian frog = new Frog();
        frog.moveInWater();
        frog.moveOnLand();
        ((Frog) frog).sayKva();

        Amphibian triton = (Frog) new Amphibian();

    }
}
