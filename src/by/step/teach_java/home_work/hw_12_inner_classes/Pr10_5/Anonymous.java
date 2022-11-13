package by.step.teach_java.home_work.hw_12_inner_classes.Pr10_5;

public class Anonymous {

    private int i = 5;

    private void method() {

    }

    Anonymous anonymous = new Anonymous();

    {

        void methodTwo () {
        anonymous.i = 6;
        anonymous.method();
    }
    }

    ;
}

