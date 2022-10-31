package by.step.teach_java.class_work.cw_27102022_generics;


public class Transport<E> {
    private E transport;

    public void setTransport() {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Transport{" +
                "transport=" + transport +
                '}';
    }
}
