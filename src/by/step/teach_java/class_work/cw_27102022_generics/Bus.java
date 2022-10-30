package by.step.teach_java.class_work.cw_27102022_generics;

public class Bus {

    String name = "Bus";

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Bus{" +
                "name='" + name + '\'' +
                '}';
    }
}
