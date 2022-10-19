package by.step.teach_java.home_work.hw_7_inheritance;

public abstract class Oplata {

    String paymentTypeName;
    int nalog;

    public abstract double calculateOfPayment(int payment);

    @Override
    public String toString() {
        return "Oplata{" +
                "paymentTapeName='" + paymentTypeName + '\'' +
                ", nalog=" + nalog +
                '}';
    }
}
