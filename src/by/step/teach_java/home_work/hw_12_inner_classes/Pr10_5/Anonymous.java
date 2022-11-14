package by.step.teach_java.home_work.hw_12_inner_classes.Pr10_5;

public class Anonymous {

    private int count = 5;

    public void doSmth() {
        new MainClass() {
            public void test() {
                System.out.println("Hello from Anonim class");
//                super.count = 3;
//                super.showCount();
            }
        }.test();
    }

    private void showCount() {
        System.out.println("count = " + count);

    }
}

