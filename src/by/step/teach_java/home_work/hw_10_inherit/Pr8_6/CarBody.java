package by.step.teach_java.home_work.hw_10_inherit.Pr8_6;

public enum CarBody {

    COUPE(9, 300),
    CABRIOLET(10, 500),
    SEDAN(12, 600);

    private int consumption;
    private int price;

    public int getConsumption() {
        return consumption;
    }

    public int getPrice() {
        return price;
    }

    CarBody(int consumption, int price) {
        this.consumption = consumption;
        this.price = price;
    }
}
