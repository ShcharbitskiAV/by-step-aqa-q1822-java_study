package by.step.teach_java.class_work.cw_03102022_interfaces.interfaces;

public interface Wheels {
    void go();

    default void gas() {
        System.out.println("Let's go!");
    }

}
