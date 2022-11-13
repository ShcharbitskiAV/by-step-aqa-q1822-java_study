package by.step.teach_java.home_work.hw_10_inherit.Pr8_7;

public class MyWindow implements Movable {

    public static void main(String[] args) {
        Movable[] array = new Movable[4];
        array[0] = new Elipse();
        array[1] = new Rectangle();
        array[2] = new Circle();
        array[3] = new Point();

    }

    public void moveTo() {
        System.out.println("Coordinate modify");
    }

    @Override
    public int getX() {
        return 1;
    }

    @Override
    public int getY() {
        return 2;
    }

    @Override
    public void moveTo(int x, int y) {

    }

    @Override
    public void draw(String s) {

    }
}
