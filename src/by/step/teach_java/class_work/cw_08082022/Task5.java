import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Task5 task5 = new Task5();
        Scanner scan = new Scanner(System.in);
        System.out.print("Input your text with ' ' and '...': "); //пробел и двоеточие
        String text = scan.nextLine();
        String[] lenght = text.split("[\\s:]");
        task5.findNumberOfWords(lenght);
        System.out.println(task5.findNumberOfWords(lenght));

    }

    public int findNumberOfWords(String[] lenght) {
        int count = 0;
        for (String str : lenght) {
            if (str.length() % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
