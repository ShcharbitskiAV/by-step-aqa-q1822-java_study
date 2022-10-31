package by.step.teach_java.class_work.cw_27102022_generics;

public class Truck {

    String name = "Truck";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "name='" + name + '\'' +
                '}';
    }
}
