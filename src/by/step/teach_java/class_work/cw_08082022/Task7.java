import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Task7 task7 = new Task7();

        Scanner scan = new Scanner(System.in);
        System.out.print("Input text: ");
        String text = scan.nextLine();
        char[] array = task7.workWithArray(text);
        task7.showResult(array);
    }

    public char[] workWithArray(String text) {

        text = text.replaceAll("[0-9]", "_");
        char[] array = text.toCharArray();

        for (int i = 0; i < array.length; i++) {
            char c = array[i];
            if (Character.isUpperCase(c)) {
                array[i] = Character.toLowerCase(c);
            } else if (Character.isLowerCase(c)) {
                array[i] = Character.toUpperCase(c);
            }
        }
        return array;
    }

    public void showResult(char[] array) {

        System.out.println(array);
    }
}
