package by.step.teach_java.class_work.cw_03102022.interfaces;

public interface Wheels {
    public void go();

    default void gas() {
        System.out.println("Let's go!");
    }

}
