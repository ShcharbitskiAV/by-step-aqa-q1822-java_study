package by.step.teach_java.home_work.hw_7_inheritance;

public class Sdelka extends Oplata {

    public Sdelka() {
        super.nalog = 15;
        super.paymentTypeName = "Сделка";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * nalog / 100;
        return  payment - nalogTotal;
    }
}
