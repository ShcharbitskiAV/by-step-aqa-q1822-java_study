package by.step.teach_java.home_work.hw_12_inner_classes.Pr10_3;

public class Outer {

    private String name;

    public static void main(String[] args) {
        Inner inner = new Inner();
        System.out.println(inner.toString());

    }

    public Outer(String name) {

        this.name = name;
    }

    public Inner getObjectTypeInner() {
        return new Inner();
    }

    static class Inner {

        public String toString() {
            return "Hello from method toString in Inner class";
        }
    }

}

