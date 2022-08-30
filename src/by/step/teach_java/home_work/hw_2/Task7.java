import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task7 {
    public static void main(String[] args) { //Код этого задания взял из интернета
            Scanner sc = new Scanner(System.in);
            System.out.println("Input symbol: ");
            String simvol = sc.nextLine();
            Pattern patlatletter = Pattern.compile("[a-zA-Z]{1}");
            Matcher matlatletter = patlatletter.matcher(simvol);
            Pattern patkirletter = Pattern.compile("[а-яА-Я]{1}");
            Matcher matkirletter = patkirletter.matcher(simvol);
            Pattern patnumber = Pattern.compile("[0-999]{1}");
            Matcher matnumber = patnumber.matcher(simvol);
            if (matlatletter.matches())
            {
                System.out.println("Latin");
            }
            else if(matkirletter.matches())
            {
                System.out.println("Cyrillic");
            }
            else if(matnumber.matches())
            {
                System.out.println("Number");
            }
            else
            {
                System.out.println("Unknown");
            }
        }
}
