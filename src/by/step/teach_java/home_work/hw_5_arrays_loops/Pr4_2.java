package by.step.teach_java.home_work.hw_5_arrays_loops;

public class Pr4_2 {

    void num(int[] ocenki, String[] students) {
        int max = 0;

        if (ocenki.length > students.length || students.length > ocenki.length) {
            System.out.println("������ � �������� �� �����!!!");

            return;
        }

        for (int i = 0; i < ocenki.length; i++) {
            System.out.print(students[i] + " ");
            System.out.println(ocenki[i] + " ");
        }

        System.out.println("������ ������:");

        for (int i = 0; i < ocenki.length; i++) {
            if (ocenki[i] >= max) {
                max = ocenki[i];
            }
        }

        for (int i = 0; i < ocenki.length; i++) {
            if (ocenki[i] == max) {
                System.out.println("���������� ����: " + max + " ������� ������� " +
                        students[i] + " � �������� " + (i + 1));
            }
        }
    }

    public static void main(String[] args) {
        Pr4_2 task4_2 = new Pr4_2();
        int ocenkiOfGroup[] = {8, 4, 6, 10, 10};
        String Students[] = {"Stringovich", "Intovich", "Bytavich", "Doublovich", "Longovich"};
        task4_2.num(ocenkiOfGroup, Students);
    }
}
