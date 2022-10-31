package by.step.teach_java.class_work.cw_31102022_collections;

import java.util.ArrayList;
import java.util.List;

public class Task1 {


    public static void main(String[] args) {
        List<String> list = new ArrayList<>(5);
        list.add("Hello,");
        list.add("my");
        list.add("dear");
        list.add("enemy");

        list.add(2, "?");

        list.add(null);

        Task1 task1 = new Task1();
        task1.showArray(list);

    }

    public void showArray(List<String> list) {

        for (String element : list) {
            System.out.println(element);
        }
    }

}

