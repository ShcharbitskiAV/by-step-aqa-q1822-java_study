package by.step.teach_java.class_work.cw_03102022_interfaces.interfaces;

public class Main {
    public static void main(String[] args) {
        Vehicle [] arrayOfVehicles = new Vehicle[2];
        arrayOfVehicles[0] = new Ford();
        arrayOfVehicles[1] = new Mercedes();

        for (Vehicle elements: arrayOfVehicles
             ) {
            elements.combinationMethod();
            elements.gas();
            elements.go();
            elements.startEngine();
            elements.stopCar();
            elements.switchTransmission();
        }

    }
}
