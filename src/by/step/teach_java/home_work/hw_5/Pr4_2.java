import java.util.Arrays;

public class Pr4_2 {
    public static void main(String[] args) {
        int[] arrayOfMarkInGroup = {5, 7, 6, 6, 8, 3, 9, 10, 6};

        Arrays.sort(arrayOfMarkInGroup);

        int maxMark = arrayOfMarkInGroup[arrayOfMarkInGroup.length - 1];
        System.out.println("Maximum mark: " + maxMark);

    }
}
