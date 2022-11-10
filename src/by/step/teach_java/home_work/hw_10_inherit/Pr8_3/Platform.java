package by.step.teach_java.home_work.hw_10_inherit.Pr8_3;

public interface Platform {

    interface Engine {

        void start();

        void stop();

    }

    interface ControlPanel {
        void up();

        void down();

        void left();

        void right();
    }
}
