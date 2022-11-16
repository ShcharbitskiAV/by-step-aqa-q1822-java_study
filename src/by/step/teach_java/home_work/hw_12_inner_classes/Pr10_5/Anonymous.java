package by.step.teach_java.home_work.hw_12_inner_classes.Pr10_5;

public class Anonymous {

    private int count = 5;

    public void doSmth() {
        new Anonymous() {
            public void doSmthAnonymous() {
                System.out.println("Hello from Anonymous class");
                super.count = 15;
                super.showCount();
            }
        }.doSmthAnonymous();
    }

    private void showCount() {
        System.out.println("Count = " + count);
    }
}

