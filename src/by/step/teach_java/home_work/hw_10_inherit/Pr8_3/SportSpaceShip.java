package by.step.teach_java.home_work.hw_10_inherit.Pr8_3;

public class SportSpaceShip extends SpaceShipMain implements Platform.Engine, Platform.ControlPanel {
    String name = "SportSpaceShip";

    @Override
    public void start() {
        System.out.println("Let's go " + name);
    }

    @Override
    public void stop() {
        System.out.println("Stop" + name);
    }

    @Override
    public void up() {
        System.out.println("Move up" + name);
    }

    @Override
    public void down() {
        System.out.println("Move down" + name);
    }

    @Override
    public void left() {
        System.out.println("Move left" + name);
    }

    @Override
    public void right() {
        System.out.println("Move right" + name);
    }
}
