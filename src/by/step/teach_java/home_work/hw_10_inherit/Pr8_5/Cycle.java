package by.step.teach_java.home_work.hw_10_inherit.Pr8_5;

public class Cycle {

    protected int wheels = 0;

    public static void main(String[] args) {

        Cycle[] arrayOfCycles = new Cycle[3];
        arrayOfCycles[0] = new Unicycle();
        arrayOfCycles[1] = new Bicycle();
        arrayOfCycles[2] = new Tricycle();

        for (Cycle elements : arrayOfCycles) {
            Unicycle unicycle = (Unicycle) arrayOfCycles[0];
            Bicycle bicycle = (Bicycle) arrayOfCycles[1];
            Tricycle tricycle = (Tricycle) arrayOfCycles[2];
            unicycle.balance();
            bicycle.balance();
        }

    }


    public void ride() {
        System.out.println("Hello from ride method");
    }

    public int getWheels() {
        return wheels;
    }

}
