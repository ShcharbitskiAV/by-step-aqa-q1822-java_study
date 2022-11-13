package by.step.teach_java.home_work.hw_10_inherit.Pr8_1;

public class Detergent {
    public void scrub (String name) {

    }

    public void scrub (int number) {

    }
}

class NewClass extends Detergent {
    @Override
    public void scrub(String name) {
        super.scrub(name);
    }

    @Override
    public void scrub(int number) {
        super.scrub(number);
    }

    public void sterilize() {

    }
}