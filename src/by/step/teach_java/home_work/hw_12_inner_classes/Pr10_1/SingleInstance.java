package by.step.teach_java.home_work.hw_12_inner_classes.Pr10_1;

public class SingleInstance {

    private static SingleInstance singleInstance;

    private SingleInstance() {
    }

    public static SingleInstance getInstance() {
        if (singleInstance == null) {
            singleInstance = new SingleInstance();
        }

        return singleInstance;

    }

    public void showHashCode() {
        System.out.println("Show hashcode: " + hashCode());
    }
}
