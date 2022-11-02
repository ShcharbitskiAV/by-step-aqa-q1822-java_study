package by.step.teach_java.class_work.cw_27102022_generics;


public class Garage<T> {

    public static void main(String[] args) {
        Garage<Transport> garage = new Garage<>();

        Transport<Bus> bus = new Transport<>();
        Bus b1 = new Bus();
        b1.setName(b1.name);

        Transport<Truck> truck = new Transport<>();
        Truck t1 = new Truck();
        t1.setName(t1.name);

    }



}
