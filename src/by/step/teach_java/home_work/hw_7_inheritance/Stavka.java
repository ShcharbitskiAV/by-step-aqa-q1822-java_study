package by.step.teach_java.home_work.hw_7_inheritance;

public class Stavka extends Oplata {

    public Stavka () {
        super.nalog = 5;
        super.paymentTypeName = "Ставка";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * nalog / 100;
        return payment - nalogTotal;    }
}
