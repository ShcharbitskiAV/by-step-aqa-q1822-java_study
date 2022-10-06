package by.step.teach_java.class_work.cw_03102022.interfaces;

public class Ford implements Vehicle {
    String name = "Ford";

    @Override
    public void combinationMethod() {
        System.out.println("Собираем всё воедино " + name);
    }

    @Override
    public void stopCar() {
        System.out.println("Алё, шумахер, тормози!!! " + name);
    }

    @Override
    public void startEngine() {
        System.out.println("Не стучит и хорошо " + name);
    }

    @Override
    public void switchTransmission() {
        System.out.println("Первая, вторая, третья, четвертая, пятая " + name);

    }

    @Override
    public void go() {
        System.out.println("Поехали! " + name);
    }
}
