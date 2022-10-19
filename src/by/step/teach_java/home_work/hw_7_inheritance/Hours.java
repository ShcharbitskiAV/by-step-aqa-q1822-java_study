package by.step.teach_java.home_work.hw_7_inheritance;

public class Hours extends Oplata {

    public Hours () {
        super.nalog = 20;
        super.paymentTypeName = "Почасовая";
    }

    @Override
    public double calculateOfPayment(int payment) {
        double nalogTotal = (double) payment * nalog / 100;
        return payment - nalogTotal;
    }
}
