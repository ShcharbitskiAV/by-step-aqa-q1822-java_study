package by.step.teach_java.home_work.hw_10_inherit.Pr8_5;

public class Unicycle extends Cycle {

    @Override
    public void ride(){
        wheels = 1;
        System.out.println("Unicycle has " + getWheels() + " wheel");
    }

    public void balance () {
        System.out.println("Unicycle has balance method");
    }

}
