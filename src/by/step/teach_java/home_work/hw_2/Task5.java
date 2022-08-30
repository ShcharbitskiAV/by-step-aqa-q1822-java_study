import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner zodiak = new Scanner (System.in);
        System.out.print("Day: ");
        int day = zodiak.nextInt();
        System.out.print("Month: ");
        int month = zodiak.nextInt();
        System.out.print("Year: ");
        int year = zodiak.nextInt();

        System.out.print("Znak: ");

            if ((month == 12) && (day >= 22) || (month == 1) && (day <= 19)) {
                System.out.println("Kozerog"); }  
            else if ((month == 1) || (month == 2) && (day <= 19)) {
                System.out.println("Vodoley"); }
            else if ((month == 2) || (month == 3) && (day <= 20)) {
                System.out.println("Ryby"); } 
            else if ((month == 3) || (month == 4) && (day <= 19)) {
                System.out.println("Oven"); } 
            else if ((month == 4) || (month == 5) && (day <= 20)) {
                System.out.println("Telec"); } 
            else if ((month == 5) || (month == 6) && (day <= 20)) {
                System.out.println("Bliznecy"); } 
            else if ((month == 6) || (month == 7) && (day <= 22)) {
                System.out.println("Rak"); } 
            else if ((month == 7) || (month == 8) && (day <= 22)) {
                System.out.println("Lev"); } 
            else if ((month == 8) || (month == 9) && (day <= 22)) {
                System.out.println("Deva"); } 
            else if ((month == 9) || (month == 10) && (day <= 22)) {
                System.out.println("Vesy"); } 
            else if ((month == 10) || (month == 11) && (day <= 21)) {
                System.out.println("Skorpion"); } 
            else if (month == 12) {
                System.out.println("Strelec"); }
            else if (day > 31 || month  > 12 ) {
                System.out.println("Incorrect input");  }

        int x = (1985 - year) % 12;
        System.out.print("Year: ");

            if ((x == 1) || (x == -11)) {
            System.out.println("Krysa"); }
            else if (x == 0) {
                System.out.println("Byk"); }
            else if ((x == 11) || (x == -1)) {
                System.out.println("Tigr"); }
            else if ((x == 10) || (x == -2)) {
                System.out.println("Krolik"); }
            else if ((x == 9) || (x == -3)) {
                System.out.println("Drakon"); }
            else if ((x == 8) || (x == -4)) {
                System.out.println("Zmeya"); }
            else if ((x == 7) || (x == -5)) {
                System.out.println("Loshad'"); }
            else if ((x == 6) || (x == -6)) {
                System.out.println("Ovca"); }
            else if ((x == 5) || (x == -7)) {
                System.out.println("Obez'yana"); }
            else if ((x == 4) || (x == -8)) {
                System.out.println("Petuh"); }
            else if ((x == 3) || (x == -9)) {
                System.out.println("Sobaka"); }
            else if ((x == 2) || (x == -10)) {
                System.out.println("Svin'ya"); }
    }
}

