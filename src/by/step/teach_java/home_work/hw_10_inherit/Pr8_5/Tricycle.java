package by.step.teach_java.home_work.hw_10_inherit.Pr8_5;

public class Tricycle extends Cycle {

    @Override
    public void ride(){
        wheels = 3;
        System.out.println("Tricycle has " + getWheels() + " wheels");
    }
}
