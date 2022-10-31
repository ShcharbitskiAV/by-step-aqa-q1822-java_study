package by.step.teach_java.class_work.cw_31102022_collections;

import java.util.LinkedList;
import java.util.List;

public class Task2 {

    public static void main(String[] args) {
        List<Integer> list = new LinkedList<Integer>();

        list.add(2);
        list.add(0);
        list.add(2);
        list.add(2);

        list.add(2, 0);
        list.add(null);

        Task2 task2 = new Task2();
        task2.showArray(list);
        task2.sumOfAllElementsInArray(list);

    }

    public void showArray(List<Integer> list) {
        System.out.println(list);
    }

    public void sumOfAllElementsInArray(List<Integer> list) {
        Integer sum = 0;
        for (int i = 0; i < list.size(); i++) {
            try {
                sum += list.get(i);
            } catch (NullPointerException ex) {
                System.out.println(ex.getCause());
                System.err.println("Keep calm! It's exceptions");
            }
        }
    }
}
