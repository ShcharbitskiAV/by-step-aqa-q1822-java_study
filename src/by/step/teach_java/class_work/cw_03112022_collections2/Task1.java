package by.step.teach_java.class_work.cw_03112022_collections2;

import java.util.*;

public class Task1 {
    private List<Integer> listOfNumbers = new ArrayList<>();
    private Map<Integer, String> menu = new HashMap<>();


    public static void main(String[] args) {
        Task1 task1 = new Task1();
        task1.listOfNumbers.add(task1.getNumbersFromConsole());
        task1.generateMenu();
        task1.showMenu();

        do {
                task1.controllerOfProgram();
        }
        while();

    }

    public int getNumbersFromConsole () {
        System.out.print("Input your numbers: ");
        return new Scanner(System.in).nextInt();
    }

    public void generateMenu () {
        menu.put(1, "Add element in list");
        menu.put(2, "Delete element from list");
        menu.put(3, "Show element in list");
        menu.put(4, "Check value in list");
        menu.put(5, "Replace value in list");
        menu.put(6, "Exit");

    }

    public void showMenu () {
        for (int i = 1; i < menu.size() + 1; i++) {
            System.out.println(i + ". " + menu.get(i));
        }
    }

    public int getMenuPoint () {
        System.out.println("Input point in menu: ");
        return new Scanner(System.in).nextInt();
    }

        public void controllerOfProgram () {
            int menuPoint = getMenuPoint();

            switch (menuPoint) {
                case (1): {
                    int newNumber = getNumbersFromConsole();
                    listOfNumbers.add(newNumber);
                    break; }
                case(2):

                    break;
                case(3):
                        showListOfNumbers();
                    break;
                case(4):

                    break;
                case(5):

                    break;
                case(6):
                    endFlag = false;
                    break;

            }
        }

        public void showListOfNumbers () {
            for (Integer number: listOfNumbers) {
                System.out.println(number + ", ");
            }
            System.out.println();
    }
}
