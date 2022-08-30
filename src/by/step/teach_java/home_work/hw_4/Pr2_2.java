public class Pr2_2 {
    public static void main(String[] args) {
        //coinflip

        byte orel = 0;
        byte reshka = 0;

        for (int i = 0; i < 10; i++) {
            if (Math.random() < 0.3) {
                orel += 1;
            } else {
                reshka += 1;
            }
        }
        System.out.println("Orel: " + orel);
        System.out.println("Reshka: " + reshka);
    }
}


