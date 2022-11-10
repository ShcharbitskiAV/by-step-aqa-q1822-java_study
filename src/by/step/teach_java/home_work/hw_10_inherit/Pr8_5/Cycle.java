package by.step.teach_java.home_work.hw_10_inherit.Pr8_5;

public class Cycle {
    public static void main(String[] args) {
        Unicycle unicycle = new Unicycle();
        ride(unicycle);

        Bicycle bicycle = new Bicycle();
        ride(bicycle);

        Tricycle tricycle = new Tricycle();
        ride(tricycle);

        Cycle cycle = new Cycle();
        System.out.println(cycle.wheels(unicycle));
        System.out.println(cycle.wheels(bicycle));
        System.out.println(cycle.wheels(tricycle));

        Cycle[] arrayOfCycles = new Cycle[3];

    }

    public int wheels(Cycle cycle) {
        if (cycle.toString().equals("Unicycle")) {
            return 1;
        }
        else if (cycle.toString().equals("Bicycle")) {
            return 2;
        }

        else if (cycle.toString().equals("Tricycle")) {
            return 3;
        }
        return 0;
    }

    public static void ride(Cycle cycle) {

    }

}
