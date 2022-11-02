package by.step.teach_java.class_work.cw_31102022_collections;

import java.util.HashSet;

public class Task3 {
    public static void main(String[] args) {

        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("Vitebsk");
        hashSet.add("Minsk");
        hashSet.add("Polotsk");
        hashSet.add("Orsha");
        hashSet.add(null);
        System.out.println(hashSet.contains("Minsk"));

        Task3 task3 = new Task3();
        task3.showArray(hashSet);
    }

    public void showArray(HashSet<String> hashSet) {
        for (String element : hashSet) {
            System.out.println(hashSet);

        }
    }
}
