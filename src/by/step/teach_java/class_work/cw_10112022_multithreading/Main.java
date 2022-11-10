package by.step.teach_java.class_work.cw_10112022_multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

    public static void main(String[] args) {
        Schet schet = new Schet();

        Person p1 = new Person();
        p1.name = "Vasia";
        p1.sum = 180;

        Person p2 = new Person();
        p2.name = "Petya";
        p2.sum = 180;

        ManageSchet tranzakciya1 = new ManageSchet(schet, p1);
        ManageSchet tranzakciya2 = new ManageSchet(schet, p2);

        ExecutorService service = Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());
        service.execute(tranzakciya1);
        service.execute(tranzakciya2);


    }



}
