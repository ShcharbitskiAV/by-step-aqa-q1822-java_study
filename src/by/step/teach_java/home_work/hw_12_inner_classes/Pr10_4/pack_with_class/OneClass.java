package by.step.teach_java.home_work.hw_12_inner_classes.Pr10_4.pack_with_class;

import by.step.teach_java.home_work.hw_12_inner_classes.Pr10_4.pack_with_interface.Interface;

public class OneClass {

    protected class InnerClass implements Interface {

        @Override
        public void method() {
            System.out.println("Hello from method in protected InnerClass");

        }

        protected InnerClass() {

        }
    }
}
