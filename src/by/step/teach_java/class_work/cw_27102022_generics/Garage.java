package by.step.teach_java.class_work.cw_27102022_generics;

import java.util.ArrayList;
import java.util.List;

public class Garage <E> {

    Garage<Transport> garage = new Garage<>();

    Transport <Truck> truck = new Transport<>();
    Transport<Bus> bus = new Bus<>();

    List<E> listOfTransport = new ArrayList<E>(3);
    Transport<E> transport = new Transport<E>();

}
