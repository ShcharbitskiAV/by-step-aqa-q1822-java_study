package by.step.teach_java.class_work.cw_10112022_multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Schet {
    private int summaNaKarte = 200;
    private Lock lock = new ReentrantLock();


    public synchronized int getMyMoney (int summa) {
        if (summaNaKarte < summa) {
            throw new IllegalArgumentException("Ne hvataet deneg");
        }
        summaNaKarte -= summa;
        System.out.println("Vzyal: " + summa);
        System.out.println("Ostatok: " + summaNaKarte);
        return summa;
    }
}
